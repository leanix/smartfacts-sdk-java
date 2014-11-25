/*
 * The MIT License
 *
 * Copyright 2014 LeanIX GmbH.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.smartfacts.mid.api;

import com.smartfacts.mid.api.common.ApiException;
import com.smartfacts.mid.api.models.SearchResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import static org.fest.assertions.api.Assertions.assertThat;
import org.junit.Test;

/**
 * Integration test.
 *
 *
 *
 */
public class IntegrationTest
{

    private SmartFactsApi api = new SmartFactsApi(
            "http://mid.smartfacts.com:9200/api/v1",
            System.getProperty("username"),
            System.getProperty("password"),
            System.getProperty("apikey")
    );

    @Test
    public void downloadDiagram() throws ApiException, IOException
    {

        InputStream inputStream = api.getDiagram(
                "5",
                "BG-1205eb2ec217f074cb91d5212690384500400500512a3bd",
                "VV-8af47d27-5ad3-48dd-92bc-f47f5497098a00400503ac2804e"
        );

        // write the inputStream to a FileOutputStream
        FileOutputStream outputStream = new FileOutputStream(new File("test.png"));

        int read = 0;
        byte[] bytes = new byte[1024];

        while ((read = inputStream.read(bytes)) != -1)
        {
            outputStream.write(bytes, 0, read);
        }

        inputStream.close();
        outputStream.close();

    }

    @Test
    public void listWarehouses() throws ApiException, IOException
    {
        assertThat(api.listWarehouses()).isNotEmpty();
    }
    
    @Test
    public void search() throws ApiException, IOException
    {
        SearchResponse response = api.search("5", Boolean.TRUE, "*", 1, 0);
        assertThat(response).isNotNull();
        assertThat(response.getDocs()).isNotEmpty();
    }
}
