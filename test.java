import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt(); // table size
        int group = sc.nextInt(); // group number
        
        // テーブル席をつくる
        boolean[] table = new boolean[size];
        Arrays.fill(table, false);
        
        for(int i = 0; i < group; i++){
            int person = sc.nextInt();
            int table_number = sc.nextInt();
            
            boolean isUseable = true; // このｔｍｐパターンが使えるの？
            boolean[] tmp = table.clone();　//　元の配列を変更したくない
            
            // j : 5, 6
            for(int j = table_number; j < table_number+person; j++){
                if(tmp[j%size]==true){//今のｔｍｐのやつが使えない！
                    isUseable=false;
                    break;
                }else{
                    tmp[j%size] = true;
                }
            }
            
            if(isUseable){
                table = tmp;
            }
            
        }
        
        int ans = 0;
        for(boolean flag : table){
            if(flag) ans++;
        }
 
        System.out.println(ans);
    }
}
