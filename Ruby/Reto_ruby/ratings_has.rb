ratings = Hash.new {0}

books.values.each { |rate|
  ratings[rate] += 1
  }

puts ratings