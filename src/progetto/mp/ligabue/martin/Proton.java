package progetto.mp.ligabue.martin;

public class Proton implements Runner {

    @Override
    public void run(Executable exe) {
        // for now just the mock implementation
        String name = exe.getName();
        // remove last 4 characters from name
        name = name.substring(0, name.length() - 4);
        // set name to binaryExe
        Executable binaryExe = new Executable();
        binaryExe.setName(name);
        binaryExe.setACO();

    }

}
