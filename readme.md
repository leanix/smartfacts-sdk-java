# smartfacts-sdk-java

SDK for the smartfacts MID api. Currently used to retrieve png images.

## Usage

```java
SmartFactsApi api = new SmartFactsApi(
                "http://mid.smartfacts.com:9200/api/v1",
                "username",
                "password",
                "apikey"
        );
```

## Testing

```
mvn test -Dusername=test@test.com -Dpassword=supersecretpw -Dapikey=myapikey
```