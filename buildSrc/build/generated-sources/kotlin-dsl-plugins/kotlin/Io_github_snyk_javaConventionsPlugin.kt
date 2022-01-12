/**
 * Precompiled [io.github.snyk.java-conventions.gradle.kts][Io_github_snyk_java_conventions_gradle] script plugin.
 *
 * @see Io_github_snyk_java_conventions_gradle
 */
class Io_github_snyk_javaConventionsPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Io_github_snyk_java_conventions_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
