package blockTwoLaishevRavil;
public class Task2_13 {
    public static void main(String[] args){
        int kolvo = 0;
        for (int i = 1; i<99999; i++){
            String numb = Integer.toString(i);
            if ((numb.indexOf('4') != -1) || (numb.contains("13"))){
                kolvo++;
            }
        }
        System.out.println(kolvo+" единиц боевой техники придется исключить из учений");
    }
}





