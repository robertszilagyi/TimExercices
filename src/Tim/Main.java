package Tim;

public class Main {

    public static void main(String[] args)
    {
        // int has a width of 32

	    int myMainValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMainValue/2);

        System.out.println("My total = " + myTotal);
        // byte has a width of 8

        byte myByteValue =  -128;
        byte myNewByteValue = (byte) (myByteValue/2);

        System.out.println("My new byte value = " + myNewByteValue);
        // short has a width of 16

        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);

        System.out.println("My new short value = " + myNewShortValue);

        // Long has a width of 64

        long myLongValue = 100L;



    }
}
