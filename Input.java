import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Inputクラスは標準入力からホスト名、ユーザ名を読み込むクラスである。
 */
public class Input {
    BufferedReader reader;
    String username;
    String hostname;

    public Input() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * 標準入力からホスト名、ユーザ名を読み込む。有効でない（長さ0の文字列）を入力した場合には3回リトライする。
     * 3回リトライしても有効な入力がなかった場合には、InvalidInputExceptionを投げる。
     * @throws InvalidInputException
     */
    public void processUserRequest() throws InvalidInputException {
        boolean flag;

        // get hostname
        String hostname = null;
        flag = true;
        for (int i = 0 ; flag && i<3 ; i++) {
            this.showPrompt("Host");
            hostname = this.getString();
            if (hostname != null && hostname.length() > 0) {
                flag = false;
            }
        }

        if (flag) {
            throw new InvalidInputException();
        }

        // get hostname
        String username = null;
        flag = true;
        for (int i = 0 ; flag && i<3 ; i++) {
            this.showPrompt("User");
            username = this.getString();
            if (username != null && username.length() > 0) {
                flag = false;
            }
        }

        if (flag) {
            throw new InvalidInputException();
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

    }
}
