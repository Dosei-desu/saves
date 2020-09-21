String[] one = {"bob","john","maria"}; //length 3
String[] two = new String[5]; //length 5

arrayCopy(one,two);

println(two); //provides two null Strings, as they have not been declared yet

two[3] = "anders";
two[4] = "svend";

println(two); //provides 5 names and 0 nulls
