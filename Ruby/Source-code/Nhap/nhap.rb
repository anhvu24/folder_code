# Let’s start by creating a program that will keep track of our movie ratings.
# It’ll do one of four things: 
#     1.add a new movie to a hash, 
#     2.update the rating for an existing movie, 
#     3.display the movies and ratings that are already in the hash, or 
#     4.delete a movie from the hash. 
#     If it doesn’t receive one of those four commands, the program will output some kind of error message.



movies = {
    :hanhdong => 4,
    :sieuanhhung => 8,
    :hai => 3

}
puts movies
puts "Input what do you want to do: "
puts "ADD - add a new movie"
puts "UPDATE - update rating for a movie"
puts "DISPLAY - display all movies in list"
puts "DELETE - delete info of a movie"

action = gets.chomp.downcase    

case action
when action = "add"
    print "Input name: "
    name = gets.chomp.to_sym

    if movies[name] == nil
        print "Input rate: "
        rate = gets.chomp

        if rate.class == Integer
            movies[name] = rate.to_i
            puts "Film: #{name}, Rate: #{rate}"
        
        else
            puts "Rate must be a Number"
        end

    else
        puts "film da ton tai"
    end
    puts movies

when action = "update"
    print "Input name: "
    name = gets.chomp.to_sym

    if movies[name] == nil
        puts "film ko ton tai"

    else
        print "Input rate: "
        rate = gets.chomp.to_i
        movies[name] = rate
        puts "Film: #{name}, Rate: #{rate}"

    end
    puts movies

when action = "display"
    movies.each do |k, v| 
        puts "Film: #{k}, Rate: #{v}"
    end

when action = "delete"
    print "Input name: "
    name = gets.chomp.to_sym

    if movies[name] == nil
        puts "film ko ton tai"
    else
        movies.delete(name)

    end
    puts movies

else puts "ERROR!"
    
end



