# Topic 3 Agenda - 2

## Please turn your Microphones up - sometimes I can't hear Students when they have questions, Thank You

## Announcements

- Please read the weekly announcements
- Markdown Links, please send the actual link to the Markdown file, not directory, for example:

```
<path>/activities/activity/README.md
```

## Spring Bean Life Cycle and Scopes

|Anonotation|Description|
|--|--|
|@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)|- Default<br>- One instance of bean per Spring Container<br>- A new instance every time bean is requested|
|@RequestScope|- Scope of state between the API Request and Response<br>- Single bean instance per HTTP Request|
|@SessionScope|- Scope of state from when the application starts and ends<br>- Single bean instance per HTTP Session|
|SingletonScope|- Same as Scope / prototype|
