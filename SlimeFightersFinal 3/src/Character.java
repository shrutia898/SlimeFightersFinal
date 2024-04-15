public class Character {
    private boolean isPlaying;
    private int age;
    private String role;
    private boolean isGood;
    
    public Character(boolean isPlaying, int age, String role, boolean isGood) {
        this.isPlaying = isPlaying;
        this.age = age;
        this.role = role;
        this.isGood = isGood;    
}
    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean isGood) {
        this.isGood = isGood;
    }
}
    

