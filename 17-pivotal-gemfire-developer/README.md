## Note

The Pivotal GemFire Developer course was developed in partnership with Pivotal.  The source code for the labs is provided by Pivotal. This makes me unsure whether it can be uploaded to GitHub, since it is from a training course that Pivotal provides at a cost.  To be safe, I will not be uploading the labs.  But I will upload a Dockerfile I created, that allows GemFire to be ran inside of a docker container.

## Dockerfile
In order to create an image using the Docker file, one must first create an account at [Pivotal Network](https://network.pivotal.io/products/pivotal-gemfire).  Once an account is created, if you go to your profile page, you will see an API token at the bottom of the page.  Copy this token and past it into the Dockerfile where it says <API Token>.  The final step is to accept the EULA.  You can POST to the appropriate api to accepted it.  The API can be found [here](https://network.pivotal.io/docs/api).

After all that is complete, you should be able to build and run the contianer.

I tried creating this container as small as possible.  That is why I choose Alpine as my base image.  After I built my image, I pulled the official Apache Geode image from the Docker Hub.  The Docker image created is ~70% smaller than the Apache Geode image.