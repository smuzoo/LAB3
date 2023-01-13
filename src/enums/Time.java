package enums;

public enum Time {
    Dinner{
        public String toString(){
            return "За ужином";
        }
    },
    Evening{
        public String toString(){
            return "Вечером";
        }
    },
    BeforeGoingToBed{
        public String toString() {
            return "перед сном";
        }
    },
    Now {
        public String toString() {
            return "Теперь";
        }
    }

}
