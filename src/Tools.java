public final class Tools {
    static String splitWord(String word){
        int d=word.length()/2;

        String part1="";
        String part2="";

        try{

        if(word.length()%2==1){
         part1=word.substring(0,d+1);
         part2=word.substring(d+1);

        }else {
            part1 = word.substring(0, d + 1);
            part2 = word.substring(d + 1);
        }}catch (NullPointerException | StringIndexOutOfBoundsException ex){
            System.out.println("Fault Detected. The Concerned Detect: "+ex.getMessage());

        }return String.format("%s - %s",part1+" + "+part2);

    }
}
