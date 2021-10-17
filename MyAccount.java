public class MyAccount {
    private long deposit;    /* 預入額の合計 */
    private long withdrawal; /* 引き出し額の合計 */
    private long balance;    /* 残高 */

    public MyAccount() {
        this.deposit = 0;
        this.withdrawal = 0;
        this.balance = 0;
    }

    /**
     * 預入をする
     * @param delta 預入金額
     */
    public void deposit(long delta) {
        // 預入額は0や負の数ではない
        // 残高は預入額合計 - 引き出し額の合計
        // 残高は負ではない
        assert delta > 0;
        this.deposit += delta;
        this.balance += delta;
        assert this.balance >= 0;
    }

    /**
     * 引き出す
     * @param delta 引き出し額
     */
    private void withdraw(long delta) {
        // 預入額は0や負の数ではない
        // 残高は預入額合計 - 引き出し額の合計
        // 残高は負ではない
        assert delta > 0;
        this.withdrawal += delta;
        this.balance -= delta;
        assert this.balance >= 0;
    }

    /**
     * 残高を返す
     * @return 預金残高
     */
    public long getBalance() {
        return this.balance;
    }

    public static void main(String[] args) {
        /* ここにテストケースを書き込む
         * いくらか預入をして、引き出す。預け入れた以上に引き出した場合にはどうなるか？
         */

        MyAccount myAccount = new MyAccount();

        myAccount.deposit(5000);
        myAccount.withdraw(10000);

        System.out.println("残りの残高は" + myAccount.getBalance() + "である。");
    }
}
