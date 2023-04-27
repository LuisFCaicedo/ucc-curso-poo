print('BANK OF CODÉDEX')

pin = int(input('Ingrese PIN: '))

while pin != 1234:
  pin = int(input('PIN Incorrecto. Ingrese PIN de Nuevo: '))

if pin == 1234:
  print('PIN accepted!')
