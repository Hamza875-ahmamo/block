

import java.util.Arrays;

public class block {
    private int previousHash;
    private String [] transactions;
    private int blockHash;
    public block(int previousHash,String [] transactions){
        this.previousHash=previousHash;
        this.transactions=transactions;
        Object [] contens ={Arrays.hashCode(transactions),previousHash};
        this.blockHash=Arrays.hashCode(contens);
    }
    public int get_previousHash(){
        return previousHash;
    }
    public String [] get_transaction(){
        return transactions;
    }
    public int get_hash(){
        return blockHash;
    }
    public void set_previousHash(int previousHash){
        this.previousHash=previousHash;
    }
    public void set_transaction(String [] transactions){
        this.transactions=transactions;
    }
    public void set_blockHash(int blockHash){
        this.blockHash=blockHash;
    }
    @Override
    public String toString(){
        return "Block [ transaction=" + Arrays.toString(transactions)+
        " , blockHash="+ blockHash+ " , previousHash="+previousHash+"]";
    }
}
