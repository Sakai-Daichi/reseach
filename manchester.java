import java.lang.Object;
import java.util.Arrays;

public class manchester {
  public static void main(String args[]){

    //RandomStringUtils.random(1,"01");
    String[] input = {"0","1","1","0","0","1","0","1"};    
    System.out.println("入力数値");
    
    for(int i=0;i<input.length;i++){
      System.out.print(input[i]);
    }

    String[] n12 = input;
    String[] n25 = input;
    String[] n37 = input;
    String[] n50 = input;
    String[] n62 = input;
    String[] n75 = input;
    String[] n87 = input;

    System.out.println();
    System.out.println();

    //Encode PWM=12.5%
    System.out.println("デューティ比12.5%");
    String sync12 = "10000000";
    for(int i=0;i<input.length;i++){
      if(n12[i]=="0"){
        n12[i] = "00000010";
      }else{
        n12[i] = "00000001";
      }
    }

    System.out.println("エンコード値");
    for(int i=0;i<input.length;i++){    
      System.out.print(n12[i]);
    }
    System.out.println();

    System.out.println("同期フラグ");   //実際には同期できないと考えられる
    System.out.println(sync12);


    //Decode PWM=12.5%
    for(int i=0;i<input.length;i++){
      if(n12[i]=="00000010"){
        n12[i] = "0";
      }else{
        n12[i] = "1";
      }
    }

    System.out.println("デコード値");
    for(int i=0;i<input.length;i++){
      System.out.print(n12[i]);
    }
    System.out.println();
    System.out.println();



    //Encode PWM=25%
    System.out.println("デューティ比25%");
    String sync25 = "11000000";
    for(int i=0;i<input.length;i++){
      if(n25[i]=="0"){
        n25[i] = "00100010";
      }else{
        n25[i] = "00010001";
      }
    }

    System.out.println("エンコード値");
    for(int i=0;i<input.length;i++){    
      System.out.print(n25[i]);
    }
    System.out.println();

    System.out.println("同期フラグ");  //1が2つ連続すれば同期フラグ
    System.out.println(sync25);

    //Decode PWM=25%
    for(int i=0;i<input.length;i++){
      if(n25[i]=="00100010"){
        n25[i] = "0";
      }else{
        n25[i] = "1";
      }
    }

    System.out.println("デコード値");
    for(int i=0;i<input.length;i++){
      System.out.print(n25[i]);
    }
    System.out.println();
    System.out.println();




    //Encode PWM=37.5%
    System.out.println("デューティ比37.5%");
    String sync37 = "11100000";
    for(int i=0;i<input.length;i++){
      if(n37[i]=="0"){
        n37[i] = "00101010";
      }else{
        n37[i] = "00010101";
      }
    }

    System.out.println("エンコード値");
    for(int i=0;i<input.length;i++){    
      System.out.print(n37[i]);
    }
    System.out.println();


    System.out.println("同期フラグ");  //1が2つ以上連続すれば同期フラグ
    System.out.println(sync37);

    //Decode PWM=37.5%
    for(int i=0;i<input.length;i++){
      if(n37[i]=="00101010"){
        n37[i] = "0";
      }else{
        n37[i] = "1";
      }
    }

    System.out.println("デコード値");
    for(int i=0;i<input.length;i++){
      System.out.print(n12[i]);
    }
    System.out.println();
    System.out.println();




    System.out.println("デューティ比50%");
    //Encode PWM=50%
    String sync50 = "11110000";
    for(int i=0;i<input.length;i++){
      if(n50[i]=="0"){
        n50[i] = "10101010";
      }else{
        n50[i] = "01010101";
      }
    }

    System.out.println("エンコード値");
    for(int i=0;i<input.length;i++){    
      System.out.print(n50[i]);
    }
    System.out.println();

    System.out.println("同期フラグ");  //連続すれば同期フラグ
    System.out.println(sync50);

    //Decode PWM=50%
    for(int i=0;i<input.length;i++){
      if(n50[i]=="10101010"){
        n50[i] = "0";
      }else{
        n50[i] = "1";
      }
    }

    System.out.println("デコード値");
    for(int i=0;i<input.length;i++){
      System.out.print(n50[i]);
    }
    System.out.println();
    System.out.println();



    System.out.println("デューティ比62.5%");
    //Encode PWM=62.5%
    String sync62 = "11111000";
    for(int i=0;i<input.length;i++){
      if(n62[i]=="0"){
        n62[i] = "11101010";
      }else{
        n62[i] = "11010101";
      }
    }
   
    System.out.println("エンコード値");
    for(int i=0;i<input.length;i++){
      System.out.print(n62[i]);
    }
    System.out.println();


    System.out.println("同期フラグ");  //1が5つ連続すれば同期フラグ
    System.out.println(sync62);

    //Decode PWM=62.5%
    for(int i=0;i<input.length;i++){
      if(n62[i]=="11101010"){
        n62[i] = "0";
     }else{
        n62[i] = "1";
     }
    }
    
    System.out.println("デコード値");
    for(int i=0;i<input.length;i++){
      System.out.print(n62[i]);
    }
    System.out.println();
    System.out.println();


    System.out.println("デューティ比75%");
    //Encode PWM=75%
    String sync75 = "11111100";
    for(int i=0;i<input.length;i++){
      if(n75[i]=="0"){
        n75[i] = "11101110";
      }else{
        n75[i] = "11011101";
      }
    }

    System.out.println("エンコード値");
    for(int i=0;i<input.length;i++){
      System.out.print(n75[i]);
    }
    System.out.println();


    System.out.println("同期フラグ");  //1が6つ連続すれば同期フラグ
    System.out.println(sync75);

    //Decode PWM=75%
    for(int i=0;i<input.length;i++){
      if(n75[i]=="11101110"){
        n75[i] = "0";
      }else{
        n75[i] = "1";
      }
    }

    System.out.println("デコード値");
    for(int i=0;i<input.length;i++){
      System.out.print(n75[i]);
    }
    System.out.println();
    System.out.println();



    //Encode PWM=87.5%
    System.out.println("デューティ比87.5%");
    String sync87 = "01111111";
    for(int i=0;i<input.length;i++){
      if(n87[i]=="0"){
        n87[i] = "11111110";
      }else{
        n87[i] = "11111101";
      }
    }

    System.out.println("エンコード値");
    for(int i=0;i<input.length;i++){    
      System.out.print(n87[i]);
    }
    System.out.println();


    System.out.println("同期フラグ");  //実際には同期できない
    System.out.println(sync87);

    //Decode PWM=87.5%
    for(int i=0;i<input.length;i++){
      if(n87[i]=="11111110"){
        n87[i] = "0";
      }else{
        n87[i] = "1";
      }
    }

    System.out.println("デコード値");
    for(int i=0;i<input.length;i++){
      System.out.print(n87[i]);
    }
    System.out.println();
    System.out.println();


//System.out.println(Arrays.toString(n));

  }
}

    
