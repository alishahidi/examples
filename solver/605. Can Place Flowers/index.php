<?php

function canPlaceFlowers($flowerbed, $n)
{
  $planed_flower = $n;
  $length = count($flowerbed);
  for ($i = 0; $i < $length && $planed_flower > 0; $i++) {
    if ($flowerbed[$i]) {
      continue;
    }

    if ($i == 0  && !$flowerbed[$i + 1]) {
      $planed_flower--;
      $flowerbed[$i] = 1;
    } else if ($i == $length - 1 && !$flowerbed[$i - 1]) {
      $planed_flower--;
      $flowerbed[$i] = 1;
    } else if (!$flowerbed[$i + 1] && !$flowerbed[$i - 1]) {
      $planed_flower--;
      $flowerbed[$i] = 1;
    }
  }

  return $planed_flower == 0 ? true : false;
}
