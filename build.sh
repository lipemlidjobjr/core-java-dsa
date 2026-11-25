rm -rfv build/*.class
echo "building the student class ..."
# building the student class
javac -d build src/Student.java
javac -cp build -d build src/Welcome.java