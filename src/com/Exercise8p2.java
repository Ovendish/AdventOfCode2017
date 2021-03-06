package com;

import java.util.HashMap;
import java.util.Map;

public class Exercise8p2 {

    String input = "y inc 497 if n <= 3\n" +
            "ig inc -54 if es < 9\n" +
            "j dec 278 if low < 10\n" +
            "nm inc -531 if tr == 0\n" +
            "tq inc 537 if tq < 9\n" +
            "txm dec 835 if s != -8\n" +
            "xho dec -204 if vv < 6\n" +
            "ipq dec 59 if txm != -835\n" +
            "vv dec -259 if xho <= 210\n" +
            "tq inc 364 if qen != -7\n" +
            "xho inc -198 if xho < 205\n" +
            "afo dec -182 if j == -278\n" +
            "qen inc 774 if ntk == 4\n" +
            "cwp dec -414 if tr < 4\n" +
            "vv dec -696 if ntk == 0\n" +
            "low dec 851 if n == 0\n" +
            "tq inc -132 if t > -10\n" +
            "mux dec 626 if j >= -283\n" +
            "wby dec 759 if vv >= 950\n" +
            "qen inc 853 if j >= -283\n" +
            "qen inc -571 if tr != 0\n" +
            "ntk inc 213 if n == 0\n" +
            "qen dec 714 if qen == 853\n" +
            "es inc -936 if qen == 139\n" +
            "tq inc -496 if vv >= 955\n" +
            "tr dec -242 if afo > 175\n" +
            "tr inc 937 if ipq == -8\n" +
            "es inc 543 if wby <= -752\n" +
            "s dec -670 if low >= -860\n" +
            "vv inc 858 if ig == -46\n" +
            "ixp inc 292 if zhz >= -5\n" +
            "zhz dec 628 if xho != 8\n" +
            "wby dec 538 if tr == 242\n" +
            "y dec -183 if j > -287\n" +
            "ig inc -804 if mux >= -633\n" +
            "afo inc -89 if ig >= -862\n" +
            "low dec -423 if vv == 951\n" +
            "vv inc 144 if vv == 955\n" +
            "cwp inc 317 if s <= 677\n" +
            "ipq dec 963 if cwp < 731\n" +
            "mux dec -663 if vv <= 1091\n" +
            "qen inc 522 if ipq == 0\n" +
            "nm inc 940 if t >= -7\n" +
            "low inc -847 if ixp != 290\n" +
            "ig inc 112 if t < 2\n" +
            "tr dec -910 if ntk == 213\n" +
            "afo dec 445 if nm == 409\n" +
            "zhz inc 93 if tq < 279\n" +
            "s dec 902 if jaq <= 2\n" +
            "ixp inc -250 if n != -4\n" +
            "mux inc 41 if es < -385\n" +
            "ntk dec -326 if vv < 1102\n" +
            "wby inc -735 if mux == -585\n" +
            "jaq dec -794 if afo >= -352\n" +
            "tr inc -212 if n > -7\n" +
            "y inc 132 if tr < 948\n" +
            "tq dec -72 if cwp <= 738\n" +
            "wby inc -154 if txm > -840\n" +
            "jaq dec -138 if xho != 4\n" +
            "ixp inc 201 if cwp > 729\n" +
            "tq dec 322 if wby < -2185\n" +
            "ig inc 333 if afo <= -344\n" +
            "nm dec 688 if tq < 31\n" +
            "nm dec 204 if jaq != 931\n" +
            "ig inc -650 if qen > 658\n" +
            "t inc -269 if ixp != 239\n" +
            "vv inc 925 if vv > 1096\n" +
            "ntk inc -763 if ig != -1054\n" +
            "t dec 50 if ipq < 8\n" +
            "es inc 437 if tr <= 947\n" +
            "wby dec -465 if s > -240\n" +
            "tq inc 374 if mux == -585\n" +
            "ipq inc 26 if afo >= -355\n" +
            "cwp dec 507 if j != -272\n" +
            "j inc -521 if ntk >= -229\n" +
            "wby inc 822 if jaq == 932\n" +
            "n dec 782 if low >= -1702\n" +
            "y dec -376 if nm != -481\n" +
            "y inc 402 if cwp == 224\n" +
            "zhz dec -396 if j >= -807\n" +
            "txm inc 679 if n >= -789\n" +
            "xho inc -680 if mux <= -585\n" +
            "ig dec 716 if tq != 397\n" +
            "n inc -392 if nm > -479\n" +
            "xho inc -142 if j <= -801\n" +
            "jaq dec 33 if tr < 942\n" +
            "y dec 822 if cwp <= 228\n" +
            "jaq dec 554 if low >= -1698\n" +
            "low dec -208 if s >= -239\n" +
            "ntk inc 219 if es == 44\n" +
            "mux dec 895 if jaq > 335\n" +
            "es inc 832 if ntk < 0\n" +
            "vv dec 68 if cwp > 231\n" +
            "cwp dec -357 if y <= 776\n" +
            "es dec 969 if es < 886\n" +
            "nm dec 268 if txm <= -158\n" +
            "vv dec 702 if ipq > 24\n" +
            "tr dec -150 if mux > -1482\n" +
            "cwp dec -591 if low != -1483\n" +
            "cwp dec -404 if tr >= 1089\n" +
            "mux inc -586 if ipq > 19\n" +
            "xho inc -80 if n >= -784\n" +
            "tr dec -933 if cwp >= 1575\n" +
            "qen inc 512 if txm >= -160\n" +
            "n inc 206 if low > -1493\n" +
            "ixp inc -157 if n == -576\n" +
            "es inc -285 if s < -222\n" +
            "j dec -594 if qen >= 1164\n" +
            "xho inc -7 if es == -380\n" +
            "afo dec -475 if tq <= 406\n" +
            "ixp dec -542 if ixp == 93\n" +
            "xho dec 394 if zhz == -144\n" +
            "xho inc 263 if afo >= 121\n" +
            "zhz dec 393 if low <= -1482\n" +
            "xho inc -100 if j >= -212\n" +
            "ntk dec 748 if jaq == 345\n" +
            "nm inc -477 if y <= 770\n" +
            "mux inc -256 if xho == -591\n" +
            "j dec 698 if low != -1490\n" +
            "vv dec 857 if jaq == 345\n" +
            "ntk inc -133 if mux >= -2331\n" +
            "mux inc -570 if tr <= 2028\n" +
            "t dec 35 if ntk <= -886\n" +
            "ixp inc 437 if j != -207\n" +
            "ipq inc -200 if txm < -156\n" +
            "j inc -968 if ig == -1063\n" +
            "j inc -250 if n > -580\n" +
            "zhz inc 794 if zhz <= -527\n" +
            "vv dec -413 if cwp > 1569\n" +
            "nm dec -698 if ntk != -878\n" +
            "jaq inc -937 if vv <= 884\n" +
            "afo dec -121 if ig < -1071\n" +
            "low inc -887 if cwp >= 1576\n" +
            "nm inc -290 if n != -577\n" +
            "vv dec -13 if t != -354\n" +
            "tq dec 240 if n != -576\n" +
            "y inc -173 if j > -1428\n" +
            "xho inc -348 if ipq <= 20\n" +
            "wby inc -385 if ig <= -1055\n" +
            "ntk dec 570 if txm < -154\n" +
            "j inc -55 if qen < 1182\n" +
            "xho dec 9 if txm <= -148\n" +
            "s inc 212 if afo != 118\n" +
            "low dec 51 if wby <= -1292\n" +
            "xho inc -81 if zhz != 262\n" +
            "zhz dec 190 if s != -12\n" +
            "low inc 475 if tr >= 2032\n" +
            "zhz dec -876 if txm < -164\n" +
            "txm inc 792 if tr <= 2030\n" +
            "zhz inc 643 if s != -22\n" +
            "afo inc 594 if nm < -542\n" +
            "y inc 31 if tr < 2014\n" +
            "xho inc 435 if qen > 1179\n" +
            "y dec -512 if tq == 397\n" +
            "y dec -186 if wby < -1278\n" +
            "t inc -194 if zhz != 718\n" +
            "tr dec 629 if y < 1295\n" +
            "xho dec -804 if jaq > -601\n" +
            "tq dec -581 if wby >= -1285\n" +
            "nm inc -172 if tr <= 1397\n" +
            "jaq dec 579 if vv < 876\n" +
            "vv dec -666 if ntk != -1456\n" +
            "tq dec 795 if cwp <= 1585\n" +
            "tq dec -62 if ntk >= -1464\n" +
            "vv dec 779 if qen >= 1171\n" +
            "ntk inc 815 if tq > 249\n" +
            "zhz dec 11 if ntk == -1456\n" +
            "xho dec 765 if j > -1480\n" +
            "zhz dec -694 if cwp <= 1583\n" +
            "low inc 795 if tq <= 248\n" +
            "n inc 756 if ntk != -1464\n" +
            "cwp inc -300 if t > -551\n" +
            "ipq dec 858 if xho > -564\n" +
            "ixp inc 975 if n >= 172\n" +
            "mux inc 954 if ixp > 1489\n" +
            "zhz inc 552 if qen >= 1169\n" +
            "ixp dec -398 if txm <= 642\n" +
            "wby inc -643 if ixp > 1886\n" +
            "y dec -978 if vv >= 95\n" +
            "mux inc 853 if nm <= -720\n" +
            "low inc -886 if mux > -1086\n" +
            "zhz dec -990 if jaq != -587\n" +
            "low inc 111 if es > -379\n" +
            "cwp dec 416 if y <= 2273\n" +
            "zhz dec 742 if ntk < -1452\n" +
            "es inc -655 if es == -378\n" +
            "vv inc 81 if wby > -1932\n" +
            "tr inc -572 if tr == 1394\n" +
            "qen dec -217 if wby > -1928\n" +
            "ig dec -562 if y >= 2269\n" +
            "qen dec 422 if wby < -1920\n" +
            "ig dec 146 if nm >= -730\n" +
            "afo inc -5 if txm < 638\n" +
            "qen dec -747 if j == -1478\n" +
            "ixp dec -197 if ipq == -832\n" +
            "tq dec 63 if mux <= -1093\n" +
            "tr dec -194 if y <= 2266\n" +
            "qen inc -894 if nm != -731\n" +
            "tr dec -258 if es < -1028\n" +
            "mux inc 290 if s >= -25\n" +
            "n inc 653 if tr == 1080\n" +
            "xho dec -724 if jaq == -584\n" +
            "wby inc -941 if ixp >= 2086\n" +
            "j inc -918 if j > -1471\n" +
            "es dec -179 if zhz != 2198\n" +
            "txm inc -726 if tq <= 251\n" +
            "j dec 875 if ntk <= -1448\n" +
            "tr inc -499 if ig > -642\n" +
            "j dec -440 if cwp != 853\n" +
            "ipq inc -325 if zhz >= 2197\n" +
            "mux dec 200 if j > -1921\n" +
            "vv inc -51 if es <= -1026\n" +
            "vv dec -96 if n != 833\n" +
            "t inc 598 if ntk > -1457\n" +
            "jaq inc -465 if vv >= 129\n" +
            "jaq dec -642 if n <= 830\n" +
            "mux dec 752 if nm > -727\n" +
            "xho inc -607 if nm < -717\n" +
            "xho inc 453 if jaq < -1060\n" +
            "mux inc -465 if vv > 122\n" +
            "xho inc -669 if vv < 135\n" +
            "tr inc -789 if vv > 121\n" +
            "low dec 65 if zhz >= 2204\n" +
            "low dec -161 if mux >= -2210\n" +
            "tr dec -559 if nm < -719\n" +
            "tq inc -414 if ipq != -1157\n" +
            "tr inc -290 if tq <= 247\n" +
            "low inc 435 if cwp == 860\n" +
            "vv dec -621 if cwp >= 853\n" +
            "ig inc -488 if t >= 50\n" +
            "wby dec 849 if ixp == 2093\n" +
            "xho dec -948 if mux < -2206\n" +
            "ipq inc 78 if mux != -2211\n" +
            "qen dec -912 if ipq > -1080\n" +
            "ixp dec -49 if ntk > -1459\n" +
            "qen inc 882 if j == -1913\n" +
            "txm dec 426 if qen == 2615\n" +
            "n dec -105 if txm <= -510\n" +
            "y dec -757 if tq == 235\n" +
            "y dec 786 if j < -1906\n" +
            "xho inc 283 if y != 1485\n" +
            "vv inc 346 if j != -1912\n" +
            "afo inc -849 if nm == -724\n" +
            "j inc -270 if n > 937\n" +
            "n dec -907 if txm == -520\n" +
            "wby inc -682 if ixp <= 2140\n" +
            "vv dec -617 if xho <= -886\n" +
            "y dec -97 if afo <= -136\n" +
            "wby inc 762 if ntk != -1455\n" +
            "es dec -39 if afo >= -143\n" +
            "afo inc 91 if tq == 245\n" +
            "vv inc -974 if xho >= -892\n" +
            "j dec 758 if afo == -46\n" +
            "ig dec 129 if es == -994\n" +
            "y inc 947 if tq < 246\n" +
            "qen dec -15 if cwp < 868\n" +
            "es inc -430 if zhz != 2193\n" +
            "j dec 132 if ntk != -1456\n" +
            "zhz inc -779 if y == 2529\n" +
            "cwp dec -382 if cwp == 866\n" +
            "mux inc -872 if jaq <= -1058\n" +
            "ixp inc -321 if ig >= -1273\n" +
            "tr inc -56 if ixp > 1814\n" +
            "wby inc -250 if wby >= -2955\n" +
            "es dec 771 if ntk < -1448\n" +
            "tq inc 830 if s > -25\n" +
            "ixp dec 255 if qen >= 2629\n" +
            "y inc -322 if mux != -2215\n" +
            "ipq inc -154 if xho == -889\n" +
            "wby dec -975 if ig >= -1267\n" +
            "zhz inc 159 if mux <= -2209\n" +
            "nm dec 178 if vv > 735\n" +
            "xho dec 998 if ntk != -1464\n" +
            "ig inc 106 if mux == -2212\n" +
            "jaq dec -414 if cwp >= 856\n" +
            "ixp inc 139 if low == -1922\n" +
            "ixp dec 283 if cwp <= 869\n" +
            "ixp dec -457 if wby <= -2229\n" +
            "low dec 684 if mux <= -2205\n" +
            "afo inc -823 if ntk <= -1451\n" +
            "n dec 979 if j == -2939\n" +
            "j dec 185 if mux <= -2204\n" +
            "mux dec 794 if vv <= 731\n" +
            "low inc -240 if j != -3130\n" +
            "ixp dec -563 if wby > -2238\n" +
            "mux inc -791 if ig >= -1161\n" +
            "txm dec -765 if ntk == -1456\n" +
            "ipq inc 570 if tq == 1075\n" +
            "j dec 341 if ntk == -1456\n" +
            "afo inc -960 if tr != 496\n" +
            "y inc -354 if t == 50\n" +
            "wby inc -461 if ipq > -656\n" +
            "mux dec 968 if jaq < -636\n" +
            "wby inc 535 if afo <= -1826\n" +
            "wby inc -140 if nm > -909\n" +
            "zhz inc -247 if es < -2194\n" +
            "es dec 832 if afo >= -1819\n" +
            "cwp dec -172 if ig > -1160\n" +
            "ntk dec 767 if wby >= -1841\n" +
            "afo dec 999 if s < -16\n" +
            "txm inc 562 if mux > -3972\n" +
            "zhz inc -463 if tq > 1069\n" +
            "zhz dec 628 if wby < -1830\n" +
            "vv dec -217 if j < -3474\n" +
            "s inc -201 if tq < 1066\n" +
            "txm inc -972 if es >= -2203\n" +
            "tq dec 720 if xho < -1879\n" +
            "t inc 268 if wby < -1831\n" +
            "cwp inc -213 if y < 1859\n" +
            "afo inc 674 if txm == -161\n" +
            "n inc 360 if ixp == 2442\n" +
            "tq inc -328 if cwp <= 822\n" +
            "y inc -500 if low <= -2856\n" +
            "ipq inc 650 if qen != 2639\n" +
            "low inc -635 if ixp <= 2434\n" +
            "ipq inc -281 if tr > 498\n" +
            "txm dec -111 if wby >= -1838\n" +
            "ixp dec -128 if es == -2195\n" +
            "tr dec -297 if y <= 1852\n" +
            "t inc 65 if ntk <= -2223\n" +
            "nm inc 999 if nm > -912\n" +
            "ixp inc 647 if ipq != -289\n" +
            "jaq inc -884 if afo > -2150\n" +
            "txm dec -505 if tr != 508\n" +
            "zhz inc -728 if es > -2197\n" +
            "cwp inc 578 if nm < 103\n" +
            "ipq inc 156 if tr > 497\n" +
            "es inc -500 if s == -20\n" +
            "j dec 296 if zhz <= -496\n" +
            "vv dec 524 if txm > 452\n" +
            "ipq inc 417 if tq != 31\n" +
            "tq dec 630 if cwp != 1404\n" +
            "jaq inc 791 if zhz == -496\n" +
            "cwp inc 5 if wby >= -1836\n" +
            "mux dec -502 if afo < -2147\n" +
            "n inc -296 if n >= 1306\n" +
            "vv dec 883 if mux < -3468\n" +
            "txm dec -593 if j >= -3471\n" +
            "j dec -34 if zhz < -487\n" +
            "ig dec 183 if ntk <= -2219\n" +
            "y dec 236 if j >= -3441\n" +
            "ntk inc 78 if mux == -3469\n" +
            "t inc -480 if xho == -1887\n" +
            "nm inc -337 if y < 1622\n" +
            "zhz inc 966 if j == -3433\n" +
            "y inc -46 if zhz < 481\n" +
            "qen inc 281 if vv == -668\n" +
            "jaq dec 324 if tq < -599\n" +
            "vv inc 882 if low == -2840\n" +
            "ntk inc -359 if txm < 1058\n" +
            "n dec -894 if low == -2846\n" +
            "n dec 762 if y >= 1564\n" +
            "txm inc 428 if afo < -2149\n" +
            "t inc 500 if ntk > -2500\n" +
            "ntk dec -175 if y < 1577\n" +
            "txm inc -851 if nm < -234\n" +
            "t dec -802 if mux == -3469\n" +
            "tr inc 254 if n != 1431\n" +
            "afo inc 910 if mux >= -3472\n" +
            "txm dec -99 if j < -3432\n" +
            "vv dec -689 if wby == -1835\n" +
            "es inc -446 if es < -2688\n" +
            "ixp inc 703 if afo != -1242\n" +
            "nm inc -260 if afo < -1240\n" +
            "afo dec -656 if wby >= -1836\n" +
            "afo inc 866 if s > -26\n" +
            "jaq inc 700 if ipq != 285\n" +
            "xho inc 770 if tq != -596\n" +
            "qen dec -878 if t < 709\n" +
            "txm inc 175 if ntk < -2327\n" +
            "tr dec -92 if ipq != 279\n" +
            "tq inc -406 if zhz < 485\n" +
            "ntk dec 19 if y < 1577\n" +
            "es inc 164 if vv < 23\n" +
            "j dec 341 if jaq == -267\n" +
            "txm dec -776 if j > -3784\n" +
            "cwp dec -22 if s >= -28\n" +
            "n dec 944 if jaq > -269\n" +
            "tq dec 658 if s > -23\n" +
            "tr inc -482 if t >= 696\n" +
            "cwp inc 66 if xho > -1126\n" +
            "es dec 880 if afo != 271\n" +
            "nm dec -457 if cwp >= 1491\n" +
            "ixp inc -690 if ntk < -2344\n" +
            "n inc 552 if jaq != -267\n" +
            "ntk dec 24 if tr == 276\n" +
            "low dec 582 if tr > 278\n" +
            "n dec -373 if j != -3776\n" +
            "wby inc 783 if ipq == 279\n" +
            "xho inc -720 if qen >= 3786\n" +
            "ntk inc 783 if xho < -1830\n" +
            "tq dec 720 if tq < -1675\n" +
            "vv inc -358 if wby > -1060\n" +
            "zhz inc 347 if tr < 278\n" +
            "vv inc -448 if n == 859\n" +
            "j dec 487 if ig >= -1342\n" +
            "n inc -604 if xho > -1840\n" +
            "ipq dec 898 if tq <= -1660\n" +
            "tq inc 229 if tr != 286\n" +
            "vv dec 21 if ixp < 3231\n" +
            "tq inc 747 if ixp > 3229\n" +
            "xho dec 48 if wby >= -1057\n" +
            "tq inc 364 if jaq >= -268\n" +
            "tq inc -647 if mux > -3462\n" +
            "tq inc -580 if j >= -4260\n" +
            "n dec 937 if tq <= -324\n" +
            "cwp inc -976 if xho < -1876\n" +
            "vv inc 555 if mux == -3469\n" +
            "txm inc 305 if wby == -1047\n" +
            "jaq inc -790 if qen < 3798\n" +
            "qen dec -83 if ntk < -1580\n" +
            "afo dec 725 if txm <= 1679\n" +
            "qen inc 790 if ixp <= 3223\n" +
            "jaq dec -693 if ixp <= 3223\n" +
            "tr inc 706 if txm == 1675\n" +
            "tq inc 547 if es < -3849\n" +
            "tq dec 841 if t < 706\n" +
            "j dec 393 if jaq >= -1063\n" +
            "tr dec 775 if ntk <= -1584\n" +
            "y inc -706 if mux >= -3464\n" +
            "cwp dec 436 if ixp == 3230\n" +
            "low dec -311 if xho >= -1886\n" +
            "t inc 777 if es >= -3858\n" +
            "t dec -916 if ipq >= -622\n" +
            "ipq inc 85 if xho >= -1885\n" +
            "nm inc 949 if xho == -1885\n" +
            "es dec -238 if j == -4663\n" +
            "mux inc 310 if tr == 207\n" +
            "tq dec 638 if cwp >= 76\n" +
            "mux inc -922 if ixp != 3233\n" +
            "txm inc 941 if cwp != 83\n" +
            "tq inc 646 if mux > -4086\n" +
            "qen inc -179 if xho >= -1878\n" +
            "zhz inc 359 if zhz != 825\n" +
            "ipq inc 173 if y >= 1563\n" +
            "txm dec -586 if s == -16\n" +
            "afo inc -614 if tr < 211\n" +
            "jaq inc 666 if ixp != 3230\n" +
            "ixp dec 153 if es >= -3858\n" +
            "nm dec 488 if j == -4654\n" +
            "t inc 660 if afo != -1056\n" +
            "ipq inc -447 if tr >= 200\n" +
            "cwp dec 883 if t < 3062\n" +
            "txm inc -846 if tr > 198\n" +
            "j dec -33 if ipq < -815\n" +
            "zhz dec 761 if vv < -242\n" +
            "tr inc 621 if zhz <= 59\n" +
            "ig dec 26 if y != 1581\n" +
            "txm dec 376 if y < 1581\n" +
            "low inc -726 if jaq > -1066\n" +
            "txm dec -152 if es >= -3865\n" +
            "wby inc 323 if jaq <= -1048\n" +
            "low dec 884 if zhz > 57\n" +
            "n dec 112 if t != 3062\n" +
            "ig inc 332 if xho != -1878\n" +
            "afo dec -295 if low > -4150\n" +
            "wby dec -158 if nm <= -47\n" +
            "low inc 824 if n <= -790\n" +
            "ipq dec -90 if y != 1570\n" +
            "j inc 41 if tq <= -608\n" +
            "txm inc 712 if j == -4613\n" +
            "n dec 557 if n < -793\n" +
            "ipq dec 340 if xho != -1885\n" +
            "wby dec 699 if wby <= -721\n" +
            "ipq dec 468 if y <= 1577\n" +
            "es inc 999 if ixp <= 3077\n" +
            "j dec -798 if es == -2858\n" +
            "es inc 652 if mux <= -4084\n" +
            "ntk inc -262 if ntk == -1589\n" +
            "n dec 528 if afo <= -758\n" +
            "vv dec 511 if es > -2861\n" +
            "ntk inc 78 if ixp < 3076\n" +
            "qen inc 502 if j < -3819\n" +
            "afo inc 363 if jaq < -1052\n" +
            "nm inc 215 if wby == -1428\n" +
            "s inc 608 if tq < -619\n" +
            "txm dec 100 if low >= -3324\n" +
            "mux inc 516 if mux > -4085\n" +
            "cwp inc -888 if ntk >= -1856\n" +
            "wby inc -941 if afo >= -408\n" +
            "tr dec 686 if cwp <= -1684\n" +
            "ig inc -365 if jaq > -1061\n" +
            "tq inc -593 if zhz == 64\n" +
            "cwp inc -867 if wby == -2369\n" +
            "ixp inc 736 if wby <= -2370\n" +
            "qen inc -240 if tq <= -1204\n" +
            "wby dec -961 if vv <= -759\n" +
            "txm inc 132 if ixp > 3075\n" +
            "ig inc 984 if n < -1877\n" +
            "ixp inc -898 if vv >= -769\n" +
            "wby inc -517 if es >= -2864\n" +
            "mux dec 735 if afo <= -396\n" +
            "n dec 971 if txm != 2290\n" +
            "t dec -329 if cwp > -2568\n" +
            "ig dec -780 if y < 1573\n" +
            "ixp dec 955 if tr <= -471\n" +
            "wby inc 545 if wby <= -1920\n" +
            "cwp dec -506 if afo == -400\n" +
            "afo inc 191 if vv > -764\n" +
            "afo inc -314 if s <= -13\n" +
            "ig dec -7 if tr > -486\n" +
            "afo dec 643 if n >= -1872\n" +
            "low dec -477 if nm != 183\n" +
            "t dec 98 if xho != -1885\n" +
            "nm dec -343 if zhz == 64\n" +
            "n dec -941 if zhz == 64\n" +
            "cwp inc 222 if ixp != 1218\n" +
            "zhz inc 756 if nm > 522\n" +
            "nm dec -233 if cwp != -2329\n" +
            "n inc 158 if es >= -2864\n" +
            "j dec 447 if ipq >= -1189\n" +
            "vv dec 236 if es <= -2852\n" +
            "txm dec -940 if j < -4264\n" +
            "low dec -631 if ntk == -1851\n" +
            "t inc 552 if tr != -479\n" +
            "nm inc -390 if vv >= -1006\n" +
            "ipq inc -589 if j <= -4263\n" +
            "tq dec -273 if n >= -785\n" +
            "wby dec 62 if jaq > -1062\n" +
            "t inc 897 if qen == 3639\n" +
            "ipq inc -541 if nm >= 355\n" +
            "jaq dec 169 if wby != -1452\n" +
            "mux dec 922 if nm > 354\n" +
            "y dec -185 if t < 3391\n" +
            "tq inc -170 if es > -2864\n" +
            "cwp inc -459 if es != -2849\n" +
            "tr dec -384 if ntk > -1854\n" +
            "vv inc 776 if s < -26\n" +
            "ixp dec 603 if vv >= -1005\n" +
            "ig dec -979 if low == -2213\n" +
            "qen inc -345 if jaq < -1216\n" +
            "s dec -931 if tr != -100\n" +
            "s dec 252 if ipq != -1721\n" +
            "wby inc 487 if tq <= -1096\n" +
            "tq inc 653 if ntk < -1841\n" +
            "xho dec -526 if y == 1756\n" +
            "ipq inc -563 if txm >= 2283\n" +
            "nm inc -679 if qen == 3287\n" +
            "cwp dec 223 if y > 1754\n" +
            "es inc 852 if tq < -447\n" +
            "es dec 455 if txm >= 2285\n" +
            "ntk dec 787 if y != 1749\n" +
            "tr inc 873 if xho < -1352\n" +
            "ig inc 690 if txm < 2281\n" +
            "cwp inc -367 if y != 1754\n" +
            "ig dec 502 if j < -4263\n" +
            "j dec -144 if cwp <= -3379\n" +
            "zhz inc 287 if mux >= -5222\n" +
            "ntk dec -34 if jaq != -1231\n" +
            "y inc -592 if ntk != -2610\n" +
            "afo inc 296 if s != 667\n" +
            "ixp inc 614 if es > -2465\n" +
            "jaq dec 424 if t <= 3385\n" +
            "ipq inc 894 if ntk > -2609\n" +
            "y dec 484 if afo == -230\n" +
            "jaq inc -458 if zhz <= 354\n" +
            "n dec -547 if ntk == -2604\n" +
            "t inc -683 if jaq <= -1689\n" +
            "t dec -703 if afo > -233\n" +
            "afo inc -998 if nm != -314\n" +
            "vv inc 695 if jaq < -1677\n" +
            "afo inc 986 if tq == -450\n" +
            "es dec -29 if ntk != -2612\n" +
            "ixp inc -666 if zhz > 359\n" +
            "txm inc -505 if low != -2213\n" +
            "qen inc -980 if txm > 2285\n" +
            "tq dec 900 if vv == -303\n" +
            "tr inc -728 if nm > -325\n" +
            "low dec -702 if ipq < -1391\n" +
            "mux inc -9 if ixp >= 1236\n" +
            "j dec -777 if s == 665\n" +
            "ig inc 527 if ipq < -1388\n" +
            "es inc 251 if n != -242\n" +
            "nm inc -979 if txm == 2290\n" +
            "wby inc -524 if tq == -1350\n" +
            "zhz dec -886 if txm < 2294\n" +
            "nm inc -296 if zhz > 1232\n" +
            "j inc 114 if wby >= -1478\n" +
            "cwp dec -142 if s <= 667\n" +
            "n inc -286 if es != -2180\n" +
            "jaq inc 681 if nm > -1591\n" +
            "mux inc -299 if txm > 2289\n" +
            "vv dec 602 if es == -2181\n" +
            "nm inc -118 if s == 653\n" +
            "s dec 176 if j != -4111\n" +
            "low dec -469 if tr >= 50\n" +
            "xho dec 775 if txm == 2290\n" +
            "mux inc -164 if ipq < -1391\n" +
            "tq dec 695 if tr < 48\n" +
            "afo inc 93 if n < -515\n" +
            "cwp inc -973 if nm > -1596\n" +
            "vv dec 517 if es < -2179\n" +
            "low dec -353 if wby == -1479\n" +
            "ixp dec -742 if ixp == 1235\n" +
            "tr inc -76 if vv < -1421\n" +
            "ixp inc -26 if txm != 2281\n" +
            "qen inc -205 if tq != -1347\n" +
            "zhz inc -178 if zhz > 1232\n" +
            "xho dec -540 if qen < 2109\n" +
            "nm inc -650 if j > -4123\n" +
            "es inc -191 if xho == -1594\n" +
            "txm dec -939 if wby == -1479\n" +
            "ig inc 658 if wby > -1471\n" +
            "xho dec -234 if n <= -529\n" +
            "nm dec -510 if ixp == 1958\n" +
            "ig inc 856 if low >= -682\n" +
            "ipq dec -415 if ixp <= 1959\n" +
            "wby inc -471 if vv > -1417\n" +
            "t inc -104 if zhz < 1062\n" +
            "low dec -345 if tq <= -1348\n" +
            "xho inc -163 if wby <= -1485\n" +
            "low inc 594 if ipq < -980\n" +
            "ipq dec 754 if ixp != 1951\n" +
            "ixp inc 263 if y != 680\n" +
            "vv inc -186 if mux != -5685\n" +
            "vv inc 436 if t < 3993\n" +
            "cwp dec 276 if xho >= -1595\n" +
            "t dec -268 if t >= 3983\n" +
            "j dec -241 if cwp == -4494\n" +
            "wby dec -883 if ipq < -972\n" +
            "afo inc 881 if ntk == -2604\n" +
            "ntk inc -543 if ntk < -2602\n" +
            "mux dec 524 if mux <= -5688\n" +
            "ixp inc -15 if low != 243\n" +
            "jaq dec -21 if wby < -590\n" +
            "tq dec 728 if jaq == -1663\n" +
            "vv dec -831 if low >= 241\n" +
            "j dec 290 if vv > -148\n" +
            "ig dec -192 if cwp == -4494\n" +
            "zhz dec 684 if j < -3874\n" +
            "tq dec 807 if cwp <= -4489\n" +
            "t inc -979 if y < 689\n" +
            "es inc 853 if qen >= 2095\n" +
            "s dec 211 if ipq >= -982\n" +
            "t inc -113 if j != -3880\n" +
            "tr inc -801 if wby >= -598\n" +
            "afo inc -405 if es < -1511\n" +
            "ipq inc -980 if y == 680\n" +
            "qen inc -345 if n >= -520\n" +
            "n dec 332 if n < -515\n" +
            "mux dec -593 if zhz <= 380\n" +
            "vv dec -97 if j > -3881\n" +
            "mux inc 321 if y >= 679\n" +
            "mux inc 299 if n > -857\n" +
            "tr dec 105 if qen <= 1757\n" +
            "y dec 746 if jaq != -1673\n" +
            "qen inc 898 if afo <= 333\n" +
            "s inc 467 if afo < 330\n" +
            "xho dec -634 if txm <= 3233\n" +
            "ig inc -288 if es <= -1512\n" +
            "es dec -371 if xho > -970\n" +
            "xho inc -421 if txm < 3235\n" +
            "ntk dec -803 if tr == -939\n" +
            "xho dec -762 if es != -1150\n" +
            "ixp dec -336 if afo > 325\n" +
            "es dec 88 if ixp >= 2273\n" +
            "n dec -586 if afo >= 321\n" +
            "zhz inc -260 if tq == -2885\n" +
            "qen dec 94 if tr < -930\n" +
            "mux inc -37 if j <= -3868\n" +
            "es inc 438 if s <= 733\n" +
            "mux dec 946 if mux < -4501\n" +
            "qen inc -341 if s > 746\n" +
            "cwp inc -773 if cwp != -4485\n" +
            "txm dec 836 if vv == -58\n" +
            "y inc 495 if wby > -603\n" +
            "txm inc -286 if ixp > 2270\n" +
            "jaq inc 147 if txm > 2104\n" +
            "tq dec -65 if j > -3878\n" +
            "cwp dec 733 if n >= -272\n" +
            "n inc -65 if j >= -3884\n" +
            "nm inc 582 if qen != 2563\n" +
            "y dec 719 if j >= -3877\n" +
            "vv inc 636 if vv <= -51\n" +
            "es dec -295 if y > -299\n" +
            "n dec 288 if cwp > -6006\n" +
            "ntk inc -40 if afo >= 322\n" +
            "tr inc -197 if s != 732\n" +
            "j inc -224 if xho < -626\n" +
            "mux dec 465 if zhz > 123\n" +
            "s dec 633 if ixp <= 2275\n" +
            "ipq inc 307 if tq == -2812\n" +
            "s dec 336 if s > 96\n" +
            "low inc 4 if vv == 578\n" +
            "t inc -665 if afo != 327\n" +
            "qen inc -403 if t >= 3161\n" +
            "t dec 586 if t >= 3160\n" +
            "txm dec 745 if tq <= -2816\n" +
            "mux dec -443 if nm != -1654\n" +
            "vv dec 370 if y < -297\n" +
            "vv dec -198 if vv == 578\n" +
            "n dec -470 if s > -240\n" +
            "cwp dec 166 if wby >= -598\n" +
            "xho dec 478 if cwp != -6171\n" +
            "n dec -914 if zhz >= 110\n" +
            "txm inc 494 if ixp >= 2264\n" +
            "tq inc -742 if n < 774\n" +
            "tr dec -748 if wby >= -599\n" +
            "wby inc 421 if es == -853\n" +
            "ipq inc -900 if qen < 2166\n" +
            "s dec 452 if es != -853\n" +
            "afo dec -929 if ntk >= -3178\n" +
            "qen inc 706 if jaq == -1516\n" +
            "ipq dec 58 if j != -3868\n" +
            "afo inc -331 if s < -221\n" +
            "ntk dec -186 if ipq == -2919\n" +
            "jaq dec -371 if y < -289\n" +
            "cwp dec -975 if n == 766\n" +
            "qen inc -631 if xho != -1090\n" +
            "cwp dec 57 if ig < 1779\n" +
            "ixp inc -146 if ipq <= -2922\n" +
            "s inc -148 if y < -283\n" +
            "zhz dec 842 if mux < -5009\n" +
            "nm inc -840 if ipq != -2923\n" +
            "mux inc -583 if wby < -171\n" +
            "j dec -467 if ig >= 1788\n" +
            "cwp inc -513 if j == -3877\n" +
            "s inc 353 if ntk != -3001\n" +
            "s dec 731 if ixp > 2273\n" +
            "tr inc 928 if afo != 3\n" +
            "vv dec 947 if jaq != -1140\n" +
            "tq inc 184 if ig <= 1785\n" +
            "vv dec 571 if s != -375\n" +
            "n dec 222 if vv == -742\n" +
            "ig dec 812 if qen <= 2235\n" +
            "s inc 722 if y > -294\n" +
            "afo dec 278 if cwp != -5708\n" +
            "tr dec 897 if low < 245\n" +
            "es inc 439 if afo == -282\n" +
            "zhz inc 976 if vv != -750\n" +
            "low dec 381 if ipq != -2927\n" +
            "zhz dec -510 if zhz >= 242\n" +
            "mux dec -846 if tr <= 555\n" +
            "tq dec 786 if y <= -293\n" +
            "wby inc 40 if wby >= -180\n" +
            "wby inc 461 if wby != -131\n" +
            "y inc -388 if t < 2579\n" +
            "ig dec 40 if ntk < -2992\n" +
            "txm inc -177 if nm > -2503\n" +
            "j inc -922 if tq == -3378\n" +
            "tr dec 739 if ipq != -2917\n" +
            "y dec 776 if mux == -4749\n" +
            "s inc 261 if afo != -273\n" +
            "s dec 28 if y != -1463\n" +
            "es dec 156 if txm > 1679\n" +
            "low inc -914 if es == -413\n" +
            "xho inc 923 if s <= 584\n" +
            "txm inc -979 if txm >= 1671\n" +
            "jaq inc -102 if nm >= -2503\n" +
            "jaq dec -802 if low >= -122\n" +
            "mux inc 183 if low > -129\n" +
            "zhz dec -428 if nm == -2500\n" +
            "tq inc -712 if txm >= 692\n" +
            "tq dec -624 if txm < 705\n" +
            "zhz inc -472 if tr <= -199\n" +
            "tr dec 568 if nm < -2495\n" +
            "tr dec 602 if ixp > 2272\n" +
            "tr inc -283 if zhz == 1187\n" +
            "ntk inc 387 if ixp < 2277\n" +
            "tr inc 11 if wby <= 331\n" +
            "es dec -830 if txm != 692\n" +
            "nm inc -957 if qen > 2233\n" +
            "xho inc 564 if tq > -3475\n" +
            "s dec 145 if n < 545\n" +
            "nm inc -366 if cwp == -5704\n" +
            "t dec 752 if afo > -283\n" +
            "ig inc 881 if ipq >= -2911\n" +
            "zhz inc -139 if cwp != -5708\n" +
            "afo inc 926 if wby > 317\n" +
            "jaq dec 494 if es >= 412\n" +
            "j inc 92 if j <= -4792\n" +
            "txm inc -93 if jaq > -1743\n" +
            "tq dec 776 if y <= -1447\n" +
            "jaq inc 696 if zhz == 1048\n" +
            "mux dec -327 if j >= -4713\n" +
            "zhz dec 432 if vv >= -742\n" +
            "tq inc 100 if t > 1823\n" +
            "t inc 684 if qen <= 2238\n" +
            "txm dec 251 if mux > -4243\n" +
            "low dec -387 if j != -4702\n" +
            "txm inc -736 if qen <= 2239\n" +
            "mux dec -658 if qen < 2237\n" +
            "n inc -314 if low < 268\n" +
            "t dec -246 if mux < -3575\n" +
            "xho dec -143 if cwp > -5712\n" +
            "low inc 83 if t <= 2755\n" +
            "ixp dec 503 if y > -1460\n" +
            "cwp dec 18 if qen <= 2235\n" +
            "y inc 390 if zhz != 616\n" +
            "ntk dec -289 if ipq > -2927\n" +
            "s inc -982 if low <= 343\n" +
            "jaq dec -701 if ntk <= -2327\n" +
            "n inc -62 if j >= -4703\n" +
            "nm inc 870 if tr >= -1037\n" +
            "xho inc -962 if j > -4715\n" +
            "afo inc 226 if y != -1459\n" +
            "j dec -510 if s != -557\n" +
            "low inc -1 if afo != 879\n" +
            "jaq inc -847 if qen > 2231\n" +
            "jaq dec 360 if t <= 2760\n" +
            "j inc -770 if qen > 2228\n" +
            "low dec -965 if y < -1452\n" +
            "j inc 553 if mux == -3585\n" +
            "mux dec 300 if t <= 2756\n" +
            "xho inc 495 if tq > -4150\n" +
            "cwp inc -730 if ipq < -2912\n" +
            "tq inc -315 if n >= 235\n" +
            "j inc -995 if mux >= -3877\n" +
            "y inc 378 if txm < -377\n" +
            "vv dec -898 if t >= 2749\n" +
            "nm inc -432 if jaq > -2249\n" +
            "ipq inc 850 if qen > 2230\n" +
            "afo inc 853 if s != -558\n" +
            "vv dec 628 if low != 1314\n" +
            "y inc -182 if ntk <= -2323\n" +
            "wby inc 270 if j < -4958\n" +
            "n dec 685 if j < -4976\n" +
            "low inc -33 if s != -548\n" +
            "wby dec -502 if jaq < -2243\n" +
            "nm inc -400 if xho < 69\n" +
            "jaq dec -404 if t > 2744\n" +
            "mux dec 668 if t > 2748\n" +
            "wby inc -308 if xho > 63\n" +
            "low dec 790 if ixp > 1766\n" +
            "ixp inc -581 if vv > -481\n" +
            "es dec -399 if y <= -1258\n" +
            "ixp inc -839 if tq >= -4146\n" +
            "jaq inc 451 if low == 479\n" +
            "mux dec 733 if j < -4957\n" +
            "cwp inc 263 if xho == 66\n" +
            "y dec -522 if ntk < -2319\n" +
            "t dec 764 if ixp <= 356\n" +
            "vv inc 458 if es != 819\n" +
            "afo dec 798 if xho < 67\n" +
            "wby dec -902 if zhz > 616\n" +
            "ixp inc 881 if s > -554\n" +
            "ntk inc -955 if s != -550\n" +
            "nm inc -890 if n >= 229\n" +
            "n dec -214 if j > -4972\n" +
            "wby inc -553 if txm <= -388\n" +
            "s dec -319 if tr != -1033\n" +
            "t inc 18 if mux < -5272\n" +
            "tr dec 923 if zhz <= 625\n" +
            "xho inc -917 if afo != 927\n" +
            "tq dec -518 if tr <= -1950\n" +
            "j inc -895 if ipq != -2066\n" +
            "low inc 23 if y > -738\n" +
            "vv inc 31 if zhz >= 611\n" +
            "cwp inc 447 if y >= -742\n" +
            "nm inc 702 if cwp <= -5746\n" +
            "ig dec -733 if low <= 512\n" +
            "es inc -577 if vv <= 24\n" +
            "y inc 697 if nm < -3280\n" +
            "s inc -434 if y != -31\n" +
            "tq dec 694 if ipq == -2069\n" +
            "t inc -759 if n > 442\n" +
            "jaq inc 223 if s >= -670\n" +
            "zhz inc 811 if txm < -374\n" +
            "mux inc 25 if nm > -3277\n" +
            "jaq dec 825 if nm < -3283\n" +
            "tr dec -412 if n >= 438\n" +
            "txm inc 341 if mux >= -5283\n" +
            "j dec -952 if zhz == 1427\n" +
            "qen inc 392 if cwp <= -5752\n" +
            "zhz inc 486 if txm == -39\n" +
            "afo inc -500 if wby == 790\n" +
            "s inc -208 if zhz >= 1912\n" +
            "afo dec -937 if xho != -849\n" +
            "ig inc -618 if y > -41\n" +
            "ntk inc -11 if qen > 2229\n" +
            "vv inc 34 if s <= -873\n" +
            "ixp inc 535 if cwp == -5742\n" +
            "ipq dec -996 if mux != -5290\n" +
            "s dec 436 if qen != 2224\n" +
            "ntk inc 250 if wby != 790\n" +
            "low dec -959 if txm > -46\n" +
            "y inc -807 if es <= 244\n" +
            "es inc -109 if txm == -39\n" +
            "y dec -720 if y != -846\n" +
            "t inc -658 if jaq < -2445\n" +
            "ntk inc -522 if y == -846\n" +
            "zhz inc -911 if low <= 1475\n" +
            "zhz inc 313 if vv <= 59\n" +
            "afo inc -631 if zhz <= 1319\n" +
            "low inc -18 if t == 595\n" +
            "ipq inc 16 if xho >= -855\n" +
            "cwp inc 841 if ig > 1034\n" +
            "es dec -31 if wby <= 781\n" +
            "ipq dec 904 if mux != -5286\n" +
            "cwp inc 309 if ntk > -2859\n" +
            "txm dec 413 if jaq != -2442\n" +
            "mux dec 237 if ixp <= 1771\n" +
            "vv inc -891 if ipq >= -1969\n" +
            "s dec -4 if n != 444\n" +
            "cwp dec 971 if s == -1309\n" +
            "mux inc -388 if es < 122\n" +
            "es inc -687 if txm < -442\n" +
            "ixp inc 95 if t != 591\n" +
            "jaq dec -333 if y >= -851\n" +
            "ixp dec -134 if j >= -4910\n" +
            "mux inc 496 if zhz > 1313\n" +
            "j dec -568 if afo >= 722\n" +
            "ig dec -234 if wby >= 781\n" +
            "mux dec 814 if xho > -856\n" +
            "jaq inc 78 if nm != -3276\n" +
            "nm dec -942 if ig < 1287\n" +
            "vv inc 397 if zhz == 1315\n" +
            "n inc 86 if wby != 790\n" +
            "ig dec -202 if s < -1306\n" +
            "j dec 0 if afo >= 728\n" +
            "ntk dec -320 if vv > -438\n" +
            "tr dec -962 if ipq <= -1957\n" +
            "es inc -424 if xho >= -843\n" +
            "txm dec 972 if ig <= 1487\n" +
            "cwp dec -730 if vv < -436\n" +
            "ipq dec -691 if ig == 1480\n" +
            "t inc -852 if afo == 731\n" +
            "ntk inc -361 if es <= -563\n" +
            "low inc -413 if n > 436\n" +
            "afo dec -818 if ixp != 1892\n" +
            "cwp dec -16 if wby >= 791\n" +
            "s inc 884 if ntk <= -2853\n" +
            "ipq inc -523 if low >= 1061\n" +
            "mux inc -157 if tq < -4309\n" +
            "low inc -917 if low < 1054\n" +
            "low dec -679 if zhz > 1309\n" +
            "zhz dec -426 if ntk <= -2866\n" +
            "tr dec 995 if y < -838\n" +
            "low inc -343 if jaq != -2039\n" +
            "wby dec 906 if ixp != 1899\n" +
            "txm inc 805 if n == 444\n" +
            "jaq inc -628 if nm <= -2343\n" +
            "t inc 464 if es != -554\n" +
            "qen dec 133 if low >= 821\n" +
            "xho dec -729 if zhz > 1319\n" +
            "xho inc -186 if zhz <= 1315\n" +
            "zhz dec 798 if s <= -417\n" +
            "jaq inc -726 if zhz <= 521\n" +
            "ig dec -214 if zhz > 513\n" +
            "low inc 486 if es == -558\n" +
            "ig dec -328 if y != -851\n" +
            "tq inc -112 if ixp != 1905\n" +
            "ipq inc 53 if afo != 1546\n" +
            "ntk inc 694 if es != -567\n" +
            "jaq dec -394 if tq <= -4427\n" +
            "ixp dec -575 if s <= -423\n" +
            "ig dec 694 if tr >= -1579\n" +
            "mux dec -573 if nm > -2345\n" +
            "vv inc -966 if tr <= -1576\n" +
            "vv inc 135 if tq >= -4435\n" +
            "afo dec -140 if jaq >= -3007\n" +
            "jaq inc 543 if ipq != -1217\n" +
            "vv inc -145 if vv == -1274\n" +
            "wby inc -788 if cwp < -4825\n" +
            "jaq inc -180 if zhz <= 518\n" +
            "vv inc -248 if vv >= -1425\n" +
            "zhz inc -174 if xho == -1037\n" +
            "t dec -570 if t <= 207\n" +
            "afo inc -422 if cwp > -4838\n" +
            "wby inc -494 if low >= 1297\n" +
            "s inc 20 if vv <= -1661\n" +
            "s dec -349 if ig > 1323\n" +
            "s inc -399 if txm > -627\n" +
            "tr inc 59 if ixp == 2474\n" +
            "t inc -490 if wby > -499\n" +
            "jaq dec 265 if ixp <= 2480\n" +
            "afo inc 77 if qen > 2234\n" +
            "ntk inc -683 if ixp != 2481\n" +
            "tr dec -127 if afo > 1262\n" +
            "low inc -239 if jaq < -3438\n" +
            "j inc 840 if ipq >= -1220\n" +
            "n dec 197 if vv > -1677\n" +
            "low dec 896 if nm > -2352\n" +
            "wby inc 26 if vv > -1663\n" +
            "txm inc 552 if low > 162\n" +
            "jaq inc -948 if nm >= -2347\n" +
            "tr dec -871 if txm == -67\n" +
            "s dec -498 if n >= 246\n" +
            "n inc -934 if mux >= -5430\n" +
            "j inc -113 if ntk < -2849\n" +
            "tq dec -636 if cwp < -4828\n" +
            "j inc 114 if cwp >= -4832\n" +
            "tq dec 557 if txm != -71\n" +
            "ipq inc 392 if ig <= 1335\n" +
            "low dec 739 if tq != -4343\n" +
            "s dec -853 if t < 288\n" +
            "n dec 715 if txm >= -75\n" +
            "jaq inc 140 if ixp == 2474\n" +
            "n dec 896 if xho < -1030\n" +
            "ipq inc -359 if xho < -1031\n" +
            "ixp dec -497 if j != -3506\n" +
            "afo inc -293 if low < -566\n" +
            "jaq inc 89 if nm > -2345\n" +
            "ntk dec -524 if vv >= -1669\n" +
            "ntk dec 371 if s < 897\n" +
            "s dec -478 if jaq > -4170\n" +
            "j inc 924 if ipq == -1184\n" +
            "ntk inc -239 if y == -846\n" +
            "wby inc -397 if ntk >= -2941\n" +
            "nm dec 907 if qen == 2233";

    String[][] instructions = new String[1000][7];

    Map<String, Integer> variables = new HashMap<>();

    int highestVariable = -1000;

    public void execute() {

        setInstructionsMatrix();
        initializeVariables();
        processInstructions();

        System.out.print(highestVariable);

    }

    private void setInstructionsMatrix() {
        StringBuilder currentInstruction = new StringBuilder();

        int row = 0;
        int column = 0;

        for (int i = 0; i < input.length(); i++) {
            Character currentCharacter = input.charAt(i);

            if (currentCharacter == ' ') {
                instructions[row][column] = currentInstruction.toString();
                currentInstruction.delete(0, currentInstruction.length());
                column++;
                continue;
            }
            if (currentCharacter == '\n') {
                instructions[row][column] = currentInstruction.toString();
                currentInstruction.delete(0, currentInstruction.length());
                row++;
                column = 0;
                continue;
            }

            currentInstruction.append(currentCharacter);

            if (i == input.length() - 1) {
                instructions[row][column] = currentInstruction.toString();
                break;
            }

        }
    }

    private void initializeVariables() {

        for (int i = 0; i < 1000; i++) {

            if (!variables.containsKey(instructions[i][0].toString()))
                variables.put(instructions[i][0].toString(), 0);

            if (!variables.containsKey(instructions[i][4].toString()))
                variables.put(instructions[i][4].toString(), 0);
        }

    }

    private void processInstructions() {

        for (int j = 0; j < 1000; j++) {

            String variable = instructions[j][0];
            String modifier = instructions[j][1];
            Integer modifierValue = Integer.valueOf(instructions[j][2]);
            String theIf = instructions[j][3];
            Integer testVariable1 = variables.get(instructions[j][4]);
            String testOperator = instructions[j][5];
            Integer testVariable2 = Integer.valueOf(instructions[j][6]);

            switch (testOperator){

                case ">":
                    if(testVariable1 > testVariable2){
                        modifyVariable(variable, modifier, modifierValue);
                    }
                    continue;

                case ">=":
                    if(testVariable1 >= testVariable2){
                        modifyVariable(variable, modifier, modifierValue);
                    }
                    continue;

                case "<":
                    if(testVariable1 < testVariable2){
                        modifyVariable(variable, modifier, modifierValue);
                    }
                    continue;

                case "<=":
                    if(testVariable1 <= testVariable2){
                        modifyVariable(variable, modifier, modifierValue);
                    }
                    continue;

                case "==":
                    if(testVariable1.equals(testVariable2)){
                        modifyVariable(variable, modifier, modifierValue);
                    }
                    continue;

                case "!=":
                    if(!testVariable1.equals(testVariable2)){
                        modifyVariable(variable, modifier, modifierValue);
                    }
                    continue;

            }

        }

    }

    private void modifyVariable(String variable, String modifier, Integer modifierValue) {

        Integer variableValue = variables.get(variable);

        if (modifier.equals("dec"))
            modifierValue *= -1;

        variableValue += modifierValue;

        if (variableValue > highestVariable)
            highestVariable = variableValue;

        variables.put(variable, variableValue);

    }

}

