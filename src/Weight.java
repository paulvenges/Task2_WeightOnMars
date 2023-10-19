public class Weight {
    public static void main(String[] args) {
// CREATING VARIABLES
        float marsWeightPaul;
        float earthGravityPaul;
        float marsGravityPaul;
        float massPaul = 73 ;

//ASSIGNING VALUES TO MY VARIABLES
        earthGravityPaul =9.81F;
        marsGravityPaul = (float) (0.38*earthGravityPaul);
        marsWeightPaul =(marsGravityPaul*massPaul);

//after assigning the assignment, write the variable double to the console, limiting its length to 4 decimal places,
        double marsWeightPaul1 =marsWeightPaul;

//cast the above variable of double type to a new variable of int type,
        int marsWeightPaul2 = (int) marsWeightPaul1;

//cast the above variable of type int to a new variable of type char,
        char marsWeightPaul3 = (char) marsWeightPaul2;

        int marsWeightPaul4 = marsWeightPaul3 ;


        System.out.println(marsWeightPaul4);


    }
}
