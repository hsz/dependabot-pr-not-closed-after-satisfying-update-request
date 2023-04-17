This is a repository to visualize the issue of Dependabot not closing the PRs when the dependency is updated in the [`libs.versions.toml`](./gradle/libs.versions.toml) file.

I have initiated the repository with a single Kotlin plugin dependency in the `libs.versions.toml` file with an outdated version set: `1.8.10`.
After receiving the PR, I have cherry-picked Dependabot's commit with `1.8.20` version and pushed it to the `main` branch.
Unfortunately, Dependabot did not close the PR.

Filed issue:
https://github.com/dependabot/dependabot-core/issues/7105
