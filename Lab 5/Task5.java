public class Task5 {

    public char firstSingleLetter(char text[] ,int n) {

        char singleChar = ' ';
        boolean found = false;

        for(int i=0; i<n; i++) {

            for(int j=0; j<n; j++) {

                // if char is not matched with any other character.
                if(j == n-1) {
                    found = true;
                }

                // don't compare char with it self
                if(j == i ) {
                    continue;
                }

                // if char is duplication end loop 
                if(text[i] == text[j]) {
                    found = false;
                    break;
                }

            }

            // if char is unique return char
            if(found) {
                singleChar = text[i];
                break; 
            }
        }
        return singleChar;
    }

    public static void main(String[] args) {

        Task5 obj = new Task5();

        char[] arr = {'a','e','a','c','e'};

        System.out.println(obj.firstSingleLetter(arr,5));

    }
}