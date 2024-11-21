import java.util.ArrayList;
public class blockchaine {
    public static void main(String[] args) {
        // demonstrate a series of blocks in chain
        ArrayList<block>blockProgramming=new ArrayList<block>();
        String [] intialvalues={"hamza has 700$","hakim haS 20 BITCOIN"};
        block firstBlock=new block(0,intialvalues);
        blockProgramming.add(firstBlock);
        System.err.println("first block is " +firstBlock.toString());
        System.err.println("the block chain is " + blockProgramming.toString());
        String [] hamza_gives_hakim={"hamza gives hakim 400$","abdessadek give omar 300$"};
        block secondBlock=new block(firstBlock.get_hash(),hamza_gives_hakim);
        blockProgramming.add(secondBlock);
        System.err.println("the second block is " +secondBlock.toString());
        System.err.println("the block chain is " + blockProgramming.toString());




    }
}
