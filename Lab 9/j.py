def decrypt_RSA(e, n, ciphertext):
    # Create a table of all possible characters
    table = {pow(i, e, n): chr(65 + i) for i in range(26)}
    
    # Decrypt the ciphertext
    plaintext = ''.join(table[c] for c in ciphertext)
    
    return plaintext

# Given values
e = 17
n = 19519
ciphertext = [6625, 0, 2968, 17863]

# Decrypt the ciphertext
plaintext = decrypt_RSA(e, n, ciphertext)

print(f"The plaintext is: {plaintext}")
