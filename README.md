# Massage Decoding
- It is a ***String Data Packet*** which contains binary values. **Second byte** is the length of the hidden massage, **first byte** will XOR with all the char of the massage byte.
## For Example 
- Let String **DATA** is = "10101010000001011110001011001111110001101100011011000101"
- So, **First Byte** = 10101010 will XOR with all char of massage Byte.
- And **Second Byte** = 00000101 is the length of the hidden massage. Here value of 00000101 is 5, So length of the massage will be 5.
-  Rest of all bytes will XOR with first byte, likes-
- **First Byte** ^ 11100010
- **First Byte** ^ 11001111 
- **First Byte** ^ 11000110
- **First Byte** ^ 11000110 
- **First Byte** ^ 11000101
- Convert the binary to Decimal...
- Decimal to Char...
- At last print the **Massage**. 

<img src="https://github.com/santuroy7/Massage-Decoding/blob/main/ss1.jpg">
