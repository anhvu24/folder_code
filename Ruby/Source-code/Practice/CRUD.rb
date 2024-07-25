# Let’s start by creating a program that will keep track of our movie ratings.
# It’ll do one of four things: 
#     add a new movie to a hash, 
#     update the rating for an existing movie, 
#     display the movies and ratings that are already in the hash, or 
#     delete a movie from the hash. If it doesn’t receive one of those four commands, 
#     the program will output some kind of error message.


movies = {
    :sieunhan => 5,
    :vientuong => 1,
    :hanquoc => 3
    
}

puts "What do you want to do?"
choice = gets.chomp

case choice
when "add" #add a new movie
    puts "Title of movie?"
    title = gets.chomp
    title = title.to_sym

    if movies[title] == nil
        puts "Rating of movie?"
        rating = gets.chomp
        rating = rating.to_i

        movies[title] = rating
        puts "Film: #{title}, Rate: #{rating}"
    else
        puts "This film is already exists"
    end

when "update" #update the rating for an existing movie
    puts "Title of movie?"
    title = gets.chomp
    title = title.to_sym

    if movies[title] == nil
        puts "This film is not exists"
    else
        puts "Update rating:"
        rating = gets.chomp
        rating = rating.to_i
        movies[title] = rating
        puts "Film (updated): #{title}, Rate: #{rating}"
    end

when "display" #display the movies and ratings that are already in the hash
    movies.each do |title, rating|
        puts "#{title}: #{rating}"
    end

when "delete" #delete a movie from the hash
    puts "Title of movie?"
    title = gets.chomp
    title = title.to_sym

    if movies[title] == nil
        puts "This film is not exists"
    else
        movies.delete(title)
        puts "Delete successfully"
    end

else
    puts "Error!"
end



