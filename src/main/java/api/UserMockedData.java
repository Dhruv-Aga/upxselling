package api;

import java.util.ArrayList;
import java.util.List;

public class UserMockedData {
    //list of UserDetails posts
    private List<UserDetails> blogs;

    private static UserMockedData instance = null;
    public static UserMockedData getInstance(){
        if(instance == null){
            instance = new UserMockedData();
        }
        return instance;
    }


    public UserMockedData(){
        blogs = new ArrayList<UserDetails>();
        blogs.add(new UserDetails( "RAHUL", 4,"ail"));
    }

    // return all blogs
    public List<UserDetails> fetchBlogs() {
        return blogs;
    }

    // return UserDetails by id
    public UserDetails getBlogById(int id) {
        for(UserDetails b: blogs) {
            if(b.getId() == id) {
                return b;
            }
        }
        return null;
    }

    // search UserDetails by text
    public List<UserDetails> searchBlogs(String searchTerm) {
        List<UserDetails> searchedBlogs = new ArrayList<UserDetails>();
        for(UserDetails b: blogs) {
            if(b.getName().toLowerCase().contains(searchTerm.toLowerCase()) ||
                    b.getEmail().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchedBlogs.add(b);
            }
        }

        return searchedBlogs;
    }

    // create blog
    public UserDetails createBlog(String name,int age,  String email) {
        UserDetails newUserDetails = new UserDetails(name,age, email);
        blogs.add(newUserDetails);
        return newUserDetails;
    }

    // update blog
    public UserDetails updateBlog(int id, String name, int age, String email) {
        for(UserDetails b: blogs) {
            if(b.getId() == id) {
                int blogIndex = blogs.indexOf(b);
                b.setName(name);
                b.setEmail(email);
                b.setAge(age);
                blogs.set(blogIndex, b);
                return b;
            }

        }

        return null;
    }

    // delete UserDetails by id
    public boolean delete(int id){
        int blogIndex = -1;
        for(UserDetails b: blogs) {
            if(b.getId() == id) {
                blogIndex = blogs.indexOf(b);
                continue;
            }
        }
        if(blogIndex > -1){
            blogs.remove(blogIndex);
        }
        return true;
    }

}