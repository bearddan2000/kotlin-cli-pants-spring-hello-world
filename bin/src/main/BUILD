# kotlin classes are final by default
# for springboot applications this will throw an error
# simplest solution add keyword open to all classes

jvm_artifact(
    name='kotlin-stdlib',
    group='org.jetbrains.kotlin',
    artifact='kotlin-stdlib',
    version='1.6.21',
)
jvm_artifact(
    name='kotlin-reflect',
    group='org.jetbrains.kotlin',
    artifact='kotlin-reflect',
    version='1.6.21',
)
jvm_artifact(
    name='kotlin-script-runtime',
    group='org.jetbrains.kotlin',
    artifact='kotlin-script-runtime',
    version='1.6.21',
)

jvm_artifact(
    name="springboot",
    group="org.springframework.boot",
    artifact="spring-boot-starter",
    version="2.6.3",
    # See the callout below for more information on the `packages` argument.
    packages=["org.springframework.boot.**"],
)

kotlin_sources(
    name="kotlinsources",
    sources=[
        'kotlin/example/App.kt',
    ]
)

deploy_jar(
    name="bin",
    main="example.AppKt",
    dependencies=[
        ":kotlinsources",  # refers to the `kotlin_sources` target above which has the default name
    ],
)