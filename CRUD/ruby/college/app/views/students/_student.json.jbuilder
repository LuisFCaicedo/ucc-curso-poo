json.extract! student, :id, :name, :email, :descrition, :age, :created_at, :updated_at
json.url student_url(student, format: :json)
