# play-with-jenkins
some jenkins demo

## my understanding of jenkins

Jenkins is a automation server to support the pipelines of build, test, deployment.

We can configure the continuous integration with Git, Docker and deployment system to support efficient test, build and deployment. 

Actually the concept is from CI/CD, and jenkins is a tool used to support CI/CD

## Collaboration with code repository

Jenkins can collaborate with code repository like github or bitbucket. There are majorly three way to collaborate with git server.

- push, when commit is done, it automatically builds the code and make deployments.
- pull, the jenkins server keep query the git server to get new commit. If new commit is queried, it also automatically builds.
- fixed-time schedule, there is a fixed time schedule to execute the build and deployment in a specific time.

## Testing in CI

In general, test is integrated into CI to ensure the continuous high software quality. 

There are basically three testing

- unit test, which can be executed automatically
- integraton test, which can be executed too .
- core interface test, which can be executed too.
- regression test, which can be executed automatically too.
- QA manual test , some manual test by QA, and CI continus only when QA makes the test done. 

All thoses test can be integrated in to CI, usually unit test and regression test is necessary and core interface test is also necessaray. 

## Collaboration with docker.

CI can also collaborate with docker to enable continuous deployment. 

When build is done, CI will send the build package to the docker, and the deployment system will pull the image from docker to enable deployment.


## Code review

Actually, code review can also be integrate into CI. 
