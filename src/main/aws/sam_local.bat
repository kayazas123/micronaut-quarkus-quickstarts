docker build . -t micronaut-quickstart
mkdir -p build
docker run --rm --entrypoint cat micronaut-quickstart  /home/application/function.zip > build/function.zip
sam local start-api -t sam.yaml -p 3000