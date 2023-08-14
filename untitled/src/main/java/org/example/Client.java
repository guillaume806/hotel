package org.example;

public class Client {


        private int id;
        private String firstName;
        private String lastName;
        private String phoneNumber;

        public Client(String firstName, String lastName, String phoneNumber) {
                this.id += 1;
                this.firstName = firstName;
                this.lastName = lastName;
                this.phoneNumber = phoneNumber;
        }

        public String getFirstName() {
                return firstName;
        }

        public void setFirstName(String firstName) {
                this.firstName = firstName;
        }

        public String getLastName() {
                return lastName;
        }

        public void setLastName(String lastName) {
                this.lastName = lastName;
        }

        public String getPhoneNumber() {
                return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
        }

}