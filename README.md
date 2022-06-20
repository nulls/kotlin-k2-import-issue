# kotlin-k2-import-issue

The plugin `kotlin-maven-plugin` fails with `Overload resolution ambiguity between candidates` when Kotlin K2 compiler is enabled and the property is set
```xml
<sourceDirs>
    <source>${project.basedir}/src/main/kotlin</source>
</sourceDirs>
```

Gradle doesn't have such problem.

Also, the simple function doesn't reproduce such problem. Looks like inlining of them helps
