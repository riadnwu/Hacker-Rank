/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordnumber;

/**
 *
 * @author Riadul
 */
public class WordnUmber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s="Character encoding is a term which represents a repertoire of characters by some kind of encoding system.Encoding a character in an effective process is always commendable because it takes few bits and minimum time for data.It has huge area of applications including data communication,data storage,transmission of textual data and database technology.In this paper,a new compression algorithm is proposed for text data which encodes a character by 6 bits namely 6-Bit Encoding (6BE).This method works with a technique of encoding by 6 bits for characters which are printable by using a lookup table.8 bit characters are converted into 6 bit by this 6BE technique and divides the characters into 4 sets.Then it uses the location of characters uniquely to encode by 6 bit.After that this technique is used in proper database technology by compressing the text data in a relation of a database.The 6BE is able to compress as well as decompress the original data with the help a lookup table.Reverse technique for decompression to get back the original table is also detailed.The outcome of 6BE technique is also applied to compress again by the common algorithm namely Huffman and LZW.Promising performance is shown by our experimental result.The technique is further explained by some examples and descriptions.";
     String[] words=s.split("\\s+");
        System.out.println(words.length);
    }
    
}
