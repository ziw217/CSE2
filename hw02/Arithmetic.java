// Zijia Wang

public class Arithmetic {
public static void main (String[] args){   

//Number of pairs of socks
int nSocks=3;
//Cost per pair of socks
//(‘$’ is part of the variable name)
double sockCost$=2.58;

//Number of drinking glasses
int nGlasses=6;
//Cost per glass
double glassCost$=2.29;

//Number of boxes of envelopes
int nEnvelopes=1;
//cost per box of envelopes
double envelopeCost$=3.25;
double taxPercent=0.06;
//total cost of socks
double totalSockcost$;
//total cost of socks
double totalGlassesCost$;
double totalEnvelopesCost$;

   System.out.println("total socks cost is "+ (nSocks*sockCost$)+ "dollars and had" + (taxPercent*nSocks*sockCost$)+ "total Tax for socks" ); // total socks
   System.out.println("total Glasses cost" + (nGlasses*glassCost$) + "dollars and had" + (taxPercent*nGlasses*glassCost$)+ "total Tax for glasses" );
   System.out.println("total Envelopes cost" + (nEnvelopes*envelopeCost$) + " cost and tax " + (taxPercent*nEnvelopes*envelopeCost$)+ "total tax for envelopes" );
   System.out.println("total cost is" + (nSocks*sockCost$+nGlasses*glassCost$+nEnvelopes*envelopeCost$)+"without tax" );
   System.out.println("Actutally paid(include tax) " + (nSocks*sockCost$*taxPercent+nSocks*sockCost$+nGlasses*glassCost$*taxPercent+nGlasses*glassCost$+nEnvelopes*envelopeCost$*taxPercent+nEnvelopes*envelopeCost$)+"with tax" );
   
  }
 }