
public class VolumeCalc {

	public static void main(String[] args) {

		double sunDiameter = 865000.0;
		double sunRadius = sunDiameter / 2.0;
		double earthDiameter = 7600.0;
		double earthRadius = earthDiameter / 2.0;
		long sunVolume = 0;
		long earthVolume = 0;
		sunVolume = Math.round((4 / 3) * Math.PI * Math.pow(sunRadius, 3));
		earthVolume = Math.round((4 / 3) * Math.PI * Math.pow(earthRadius, 3));
		long ratio = sunVolume / earthVolume;
		System.out.println("The volume of Earth is " + earthVolume + " cubic miles");
		System.out.println("The volume of Sun is " + sunVolume + " cubic miles");
		System.out.println("The ratio of the volume of the Sun to the Earth is " + ratio);

	}

}
