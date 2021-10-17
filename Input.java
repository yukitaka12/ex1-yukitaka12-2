import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Inputクラスは標準入力からホスト名、ユーザ名を読み込むクラスである。
 */
public class Input {
    BufferedReader reader;
    static String username;
    static String hostname;
    public static final int LIMIT_MISTAKE = 3;

    public Input() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * 標準入力からホスト名、ユーザ名を読み込む。有効でない（長さ0の文字列）を入力した場合には3回リトライする。
     * 3回リトライしても有効な入力がなかった場合には、InvalidInputExceptionを投げる。
     * @throwsInvalidInputException
     */
    public void processUserRequest() throws InvalidInputException {
        // get hostname
        String hostname = null;
        for (int i = 0 ; i<LIMIT_MISTAKE ; i++) {
            this.showPrompt("Host");
            hostname = this.getString();
            if (hostname != null && hostname.length() > 0) {
                break;
            }

            if(i==LIMIT_MISTAKE-1){
                throw new InvalidInputException();
            }
        }

        // get hostname
        String username = null;
        for (int i = 0 ; i<LIMIT_MISTAKE ; i++) {
            this.showPrompt("User");
            username = this.getString();
            if (username != null && username.length() > 0) {
                break;
            }

            if(i==LIMIT_MISTAKE-1){
                throw new InvalidInputException();
            }
        }

        this.hostname = hostname;
        this.username = username;
        // 本来はこの後に何かの処理をするはずだが、ここでは省略
    }

    /**
     * プロンプトを標準出力に表示する。
     * @param prompt プロンプトの種類の名前
     */
    public void showPrompt(String prompt) {
        System.out.print(prompt + "> ");
    }

    /**
     * 標準入力から１行読み込む。正しく読み取れなかった場合にはnullを返す。
     * @return 入力された文字列。もしくは、null。
     */
    public String getString() {
        try {
            return reader.readLine();
        }catch(IOException e){
            return null;
        }
    }

    public static void main(String[] args) {
        /* ここにテストケースを書き込む。
         * 1) Inputクラスのインスタンスを生成する
         * 2) processUserRequest()を呼び出す。
         *    なおInvalidInputExceptionが投げられる可能性があることに留意。
         */
        
        Input input = new Input();
        try {
            input.processUserRequest();
        } catch (InvalidInputException e) {
            e.printStackTrace();
        }

        System.out.println("ホスト名は" + hostname + "でユーザー名は" + username + "である。");
    }
}
