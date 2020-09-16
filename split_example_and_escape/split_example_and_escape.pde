String sentense = "Der 10 20";

String[] tmp = sentense.split(" "); //split på hver mellemrum

println(tmp[1]);

String sentence = "Hej. Mit navn er Kris. Hvordan går det?";

String[] temp = sentence.split("\\. "); //escape "\\" er nødvendig til speciel tegn
println(temp[1]);
