package Advanced_Bank_Account_Processor;

class NegativeAmountException extends  Exception{
    public NegativeAmountException(String message){
        super(message);
    }
}