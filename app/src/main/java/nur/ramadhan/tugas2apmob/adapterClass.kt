package nur.ramadhan.tugas2apmob

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class adapterClass(private val listmahasiswa : List<mahasiswa>) : RecyclerView.Adapter<adapterClass.MahasiswaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MahasiswaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.data_list, parent, false)
        return MahasiswaViewHolder(view)
    }

    override fun onBindViewHolder(holder: MahasiswaViewHolder, position: Int) {
        val mahasiswa = listmahasiswa[position]
        holder.dataImage.setImageResource(mahasiswa.PasFoto)
        holder.dataNama.text = mahasiswa.DataNama
        holder.dataNim.text = mahasiswa.DataNim
    }

    override fun getItemCount(): Int {
        return listmahasiswa.size
    }

    inner class MahasiswaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val dataImage: ImageView = itemView.findViewById(R.id.foto)
        val dataNama: TextView = itemView.findViewById(R.id.nama)
        val dataNim: TextView = itemView.findViewById(R.id.nim)
    }
}