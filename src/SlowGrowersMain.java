
public class SlowGrowersMain {
    public static void main(String[] args) {
        //SlowGrowerFrame sgFrame = new SlowGrowerFrame(); sgFrame.setVisible(true);
        double specific_alpha = Math.log(11.5)/500.;
        //BioSystem.exponentialGradient_spatialAndGRateDistributions(specific_alpha);
        BioSystem.exponentialGradient_AllTheDistributions(specific_alpha);
    }
}
