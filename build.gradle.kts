import io.github.andreabrighi.gradle.gitsemver.conventionalcommit.ConventionalCommit

plugins {
    alias(libs.plugins.gitSemVer)
}

buildscript {
    dependencies {
        classpath("io.github.andreabrighi:conventional-commit-strategy-for-git-sensitive-semantic-versioning-gradle-plugin:1.0.15")
    }
}

gitSemVer {
    commitNameBasedUpdateStrategy(ConventionalCommit::semanticVersionUpdate)
    assignGitSemanticVersion()
}