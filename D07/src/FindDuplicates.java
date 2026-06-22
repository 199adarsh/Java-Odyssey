public class FindDuplicates {

    public void main(String[] args){

        String[] s1 = {"Orange", "Mango", "Apple", "Strawberry","Pineapple"};
        String[] s2 = {"Banana","Papaya","Orange","Jackfruit","Strawberry",};

        for(String s : s1){
            for(String x : s2){
                if(s.equals(x)){
                    System.out.println(s+" : Present in both Array Strings ");
                }

            }
        }
    }

}
