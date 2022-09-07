mkdir build
gcc buttonGroup.c -std=c99 -o build/buttonGroup_c.exe
g++ buttonGroup.cpp -o build/buttonGroup_cpp.exe
g++ buttonGroup2.cpp -o build/buttonGroup2_cpp.exe
nim c -d:release -o:buttonGroup_nim.exe --outdir:build buttonGroup.nim 
javac buttonGroup.java -encoding utf-8 -d build