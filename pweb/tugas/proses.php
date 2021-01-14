<h2> Maka </h2>
  <?php
  $n1=$_Post['nilai1'];
  $n2=$_Post['nilai2'];
  $htg=$_Post['hitung'];
  if($htg=='tambah'){
    echo "Jumlahnya = ",$n1+$n2;
  }
  if($htg=='kurang'){
    echo "Selisihnya = ",$n1-$n2;
  }
  if($htg=='kali'){
    echo "Hasil kalinya = ",$n1*$n2;
  }
  if($htg=='bagi'){
    echo "Hasil baginya = ",$n1/$n2;
  }
  
 ?>