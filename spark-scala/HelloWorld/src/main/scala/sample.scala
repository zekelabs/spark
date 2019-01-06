import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object sample {
  
  def main(args : Array[String]) = {
    
  val conf = new SparkConf().setAppName("abc").setMaster("local[2]");
  val sc = new SparkContext(conf)
  val c = sc.parallelize(Array(1, 2, 3, 4, 5), 2).count();
  println(c)
  }
}