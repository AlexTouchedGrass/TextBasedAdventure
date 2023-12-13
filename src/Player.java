public class Player {
        private String lastName;
        private String firstName;
        private int age;

        //Constructor
    public Player (String firstName, String lastName, int age){
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
        }

        public String toString() {
            return String.format("First name: %s Last Name: %s Age: %d", this.firstName, this.lastName, this.age);
        }

        //Accessors
        public String getLastName(){
            return lastName;
        }

        public String getFirstName(){
            return firstName;
        }

        public int getAge(){
            return age;
        }


        //Mutators
        public void setFirstname(String firstName){
            this.firstName = firstName;
        }

        public void setLastName(String lastName){
            this.lastName = lastName;
        }

        public void setAge(int age){
            this.age = age;
        }
}
