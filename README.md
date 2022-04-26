# Policy Expert Serenity Demo project

## The starter project
This demo was created using ([https://github.com/serenity-bdd/serenity-cucumber-starter](https://github.com/serenity-bdd/serenity-cucumber-starter)). 

## Executing the tests

Recommended, use IntelliJ and the cucumber java plugin to create a run configuration using cucumber. 

examples are included in ideaConfigurations/
- cucumberBasicInfoScenario/Scenario_ User can provide basic information.run.xml - runs a single scenario using the Serenity Cucumber runner
- gradleBuildAndRunAll/serenity-cucumber-policy-expert [build].run.xml - builds and runs the whole project and runs all tests

The test results will be recorded in the `target/site/serenity` directory. If you've run the full build you'll have an aggregated report available here

`target/site/serenity/index.html`

if you ran a single scenario look for a single html file e.g. `target/site/serenity/05685605cc5b88bc20123ee62bf1f25ffcf19e6d9349352a0b321b4111bd55bc.html`

## troubleshooting

older versions of the JRE (e.g. 1.8.0_282*) do not work, most likely due to an incompatibility with CGLIB. If you see an error like this :-

```bash
# A fatal error has been detected by the Java Runtime Environment:
#
#  SIGSEGV (0xb) at pc=0x000000010b565a8b, pid=35190, tid=0x0000000000009303
#
# JRE version: OpenJDK Runtime Environment (8.0_282) (build 1.8.0_282-bre_2021_01_20_16_37-b00)
# Java VM: OpenJDK 64-Bit Server VM (25.282-b00 mixed mode bsd-amd64 compressed oops)
# Problematic frame:
# V  [libjvm.dylib+0x565a8b]  Unsafe_SetByte+0xd2

```
then upgrade your JRE/JDK to a more recent version. Oracle OpenJdk 1.8.0_321 is known to work. The simplest way to do this is to configure the JDK to point to JDK 1.8.0_321 in Intellij > Project Structure


## Want to learn more?
See [**this article**](https://johnfergusonsmart.com/environment-specific-configuration-in-serenity-bdd/) for more details about this feature.
For more information about Serenity BDD, you can read the [**Serenity BDD Book**](https://serenity-bdd.github.io/theserenitybook/latest/index.html), the official online Serenity documentation source. Other sources include:
* **[Learn Serenity BDD Online](https://expansion.serenity-dojo.com/)** with online courses from the Serenity Dojo Training Library
* **[Byte-sized Serenity BDD](https://www.youtube.com/channel/UCav6-dPEUiLbnu-rgpy7_bw/featured)** - tips and tricks about Serenity BDD
* For regular posts on agile test automation best practices, join the **[Agile Test Automation Secrets](https://www.linkedin.com/groups/8961597/)** groups on [LinkedIn](https://www.linkedin.com/groups/8961597/) and [Facebook](https://www.facebook.com/groups/agiletestautomation/)
* [**Serenity BDD Blog**](https://johnfergusonsmart.com/category/serenity-bdd/) - regular articles about Serenity BDD
