public class User {

        private String username;
        private String password;

        public User (String username, String password) {
            this.username = username;
            this.password = password;
        }

        public void setUsername() {
            this.username = username;
        }
        public void setPassword() {
            this.password = password;
        }
        public String getUsername() {
            return username;
        }
        public String getPassword() {
            return password;
        }

        public String saida() {
            return username.toUpperCase() + " " + password.toUpperCase();
        }

        public  String saida(boolean mostrarsenha) {
            if (mostrarsenha) {
                return saida();
            }
            return username;

        }

        public String toString(){
            return " User {" + "username=" + username + ", password=" + password + '}';
        }

}
