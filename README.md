# To run the docker file: download this folder or clone this github repository. In your command prompt, go to the folder where the docker file is. 

# Check that Docker is installed and version is appropriate, above 19 
# Type command: docker -- version

# Build image from dockerfile 
# Type command: docker build -t lowercasenameofimage .

# Check for docker image created 
# Type command: docker image ls

# Should list the iamge you just created 

# Run Docker container 
# Type command: docker run -p8080:8080 lowercasenameofimage

# Check Docker container is running, will list all containers that have not been deleted
# Type command: docker ps -a

# Take note of container ID 

# Stop Docker container 
# Type command: docker container stop containerid

# Start Docker container
# Type command: docker container start containerid




