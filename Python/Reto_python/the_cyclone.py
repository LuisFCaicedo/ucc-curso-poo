altura = int(input("ingresa su altura: "))
creditos = int(input("ingresa sus creditos: "))
with_taller_person = False

if creditos < 10:
  print("No tiene creditos para viajar.")
elif altura >= 137 and creditos >= 10:
  print("Disfruta el Viaje!")
elif altura < 137:
  if altura < 100 or not with_taller_person:
    print("Tadavia no eres Sufiente alto para este paseo")
  elif altura >= 100 and with_taller_person:
    print("Disfruta el viaje")
else:
  print("Datos invalidos")